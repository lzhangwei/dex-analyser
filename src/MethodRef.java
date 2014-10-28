import java.io.IOException;
import java.io.InputStream;

public class MethodRef {
    private int classTypeRef;
    private int prototypeRef;
    private int methodNameRef;

    public int getClassTypeRef() {
        return classTypeRef;
    }

    public int getPrototypeRef() {
        return prototypeRef;
    }

    public int getMethodNameRef() {
        return methodNameRef;
    }

    public MethodRef() {
    }

    public void createMethodRef(InputStream inputStream) {
        byte[] buffer2 = new byte[2];
        byte[] buffer4 = new byte[4];
        try {
            inputStream.read(buffer2);
            classTypeRef = Util.byte2ToInt(buffer2);
            inputStream.read(buffer2);
            prototypeRef = Util.byte2ToInt(buffer2);
            inputStream.read(buffer4);
            methodNameRef = Util.byte4ToInt(buffer4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
