import java.util.ArrayList;
import java.util.List;

public class Prototype {
    private String funDeclareString;
    private String returnType;
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
}
