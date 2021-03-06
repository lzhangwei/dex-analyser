import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Prototype {
    private String funDeclareString;
    private String returnType;
    private int parameterSize;
    private List<String> parameterTypes = new ArrayList<String>();

    public String getFunDeclareString() {
        return funDeclareString;
    }

    public void setFunDeclareString(String funDeclareString) {
        this.funDeclareString = funDeclareString;
    }

    public String getReturnType() {
        return returnType;
    }

    public int getParameterSize() {
        return parameterSize;
    }

    public void setParameterSize(int parameterSize) {
        this.parameterSize = parameterSize;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public List<String> getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(List<String> parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    public Prototype() {
    }

    public Prototype(String funDeclareString, String returnType, List<String> parameterTypes) {
        this.funDeclareString = funDeclareString;
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
    }

    public void createPrototype(PrototypeRef prototypeRef, StringTable stringTable, TypeTable typeTable, InputStream inputStream) {
        funDeclareString = stringTable.getStringList().get(prototypeRef.getFunDeclareStringRef());
        returnType = typeTable.getTypeList().get(prototypeRef.getReturnTypeRef());

        byte[] buffer4 = new byte[4];
        byte[] buffer2 = new byte[2];
        try {
            if (prototypeRef.getParameterTypeOff() != 0) {
                inputStream.read(buffer4);
                parameterSize = Util.byte4ToInt(buffer4);
                for (int i = 0; i < parameterSize; i++) {
                    inputStream.read(buffer2);
                    int typeIndex = Util.byte2ToInt(buffer2);
                    parameterTypes.add(typeTable.getTypeList().get(typeIndex));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String toString() {
        String result = "方法声明字符串：" + funDeclareString + ";";
        result += "方法返回类型：" + returnType + ";";
        result += "方法参数个数：" + parameterSize + ";";
        for (int i = 0; i < parameterSize; i++) {
            result += "参数" + (i + 1) + ":" + parameterTypes.get(i) + "  ";
        }
        return result;
    }
}
