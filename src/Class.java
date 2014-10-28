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
    private ClassData classData;
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
}
