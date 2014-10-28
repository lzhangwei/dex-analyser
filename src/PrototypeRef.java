import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PrototypeRef {
    private int funDeclareStringRef;
    private int returnTypeRef;
    private int parameterTypeOff;

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

    public PrototypeRef() {
    }

    public void createPrototypeRef(InputStream inputStream) {
        byte[] buffer4 = new byte[4];
        try {
            inputStream.read(buffer4);
            funDeclareStringRef = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            returnTypeRef = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            parameterTypeOff = Util.byte4ToInt(buffer4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
