import java.util.ArrayList;
import java.util.List;

public class PrototypeRef {
    private int funDeclareStringRef;
    private int returnTypeRef;
    private int parameterTypeOff;
    private int parameterSize;
    private List<Integer> parameterTypesRef = new ArrayList<Integer>();

    public int getFunDeclareStringRef() {
        return funDeclareStringRef;
    }

    public void setFunDeclareStringRef(int funDeclareStringRef) {
        this.funDeclareStringRef = funDeclareStringRef;
    }

    public int getReturnTypeRef() {
        return returnTypeRef;
    }

    public void setReturnTypeRef(int returnTypeRef) {
        this.returnTypeRef = returnTypeRef;
    }

    public int getParameterTypeOff() {
        return parameterTypeOff;
    }

    public void setParameterTypeOff(int parameterTypeOff) {
        this.parameterTypeOff = parameterTypeOff;
    }

    public int getParameterSize() {
        return parameterSize;
    }

    public void setParameterSize(int parameterSize) {
        this.parameterSize = parameterSize;
    }

    public List<Integer> getParameterTypesRef() {
        return parameterTypesRef;
    }

    public void setParameterTypesRef(List<Integer> parameterTypesRef) {
        this.parameterTypesRef = parameterTypesRef;
    }

    public PrototypeRef() {
    }
}
