import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Class {
    private String classType;
    private int accessFlag;
    private String superClassType;
    private int interfaceSize;
    private List<String> interfaceList = new ArrayList<String>();
    private String sourceFileName;
    //注解未实现
    private ClassData classData = new ClassData();
    //staticValues


    public String getClassType() {
        return classType;
    }

    public int getAccessFlag() {
        return accessFlag;
    }

    public String getSuperClassType() {
        return superClassType;
    }

    public int getInterfaceSize() {
        return interfaceSize;
    }

    public List<String> getInterfaceList() {
        return interfaceList;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public ClassData getClassData() {
        return classData;
    }

    public void createClass(ClassRef classRef, StringTable stringTable, TypeTable typeTable, InputStream inputStream) {
        classType = typeTable.getTypeList().get(classRef.getClassTypeRef());
        accessFlag = classRef.getAccessFlag();
        superClassType = typeTable.getTypeList().get(classRef.getSuperClassTypeRef());

        byte[] buffer4 = new byte[4];
        byte[] buffer2 = new byte[2];
        try {
            if (classRef.getInterfacesOff() != 0) {
                inputStream.read(buffer4);
                interfaceSize = Util.byte4ToInt(buffer4);
                for (int i = 0; i < interfaceSize; i++) {
                    inputStream.read(buffer2);
                    int typeIndex = Util.byte2ToInt(buffer2);
                    interfaceList.add(typeTable.getTypeList().get(typeIndex));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sourceFileName = stringTable.getStringList().get(classRef.getSourceFileNameRef());
    }

    public void createClassData(InputStream inputStream) {
        classData.createClassData(inputStream);
    }

    public String toString() {
        String result = "";
        result += "类类型：" + classType +";";
        result += "访问标志：" + accessFlag +";";
        result += "父类类型：" + superClassType + ";";
        result += "接口个数：" + interfaceSize + ";";
        for(int i =0;i<interfaceSize;i++) {
            result += "接口" + (i+1) + ":" +interfaceList.get(i);
        }
        result += "源文件名：" + sourceFileName + ";";
        result += "类数据：" + classData.toString();
        return result;
    }
}
