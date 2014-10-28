import java.io.IOException;
import java.io.InputStream;

public class ClassRef {
    private int classTypeRef;
    private int accessFlag;
    private int superClassTypeRef;
    private int interfacesOff;
    private int sourceFileNameRef;
    private int annotationsOff;
    private int classDataOff;
    private int staticValuesOff;

    public int getInterfacesOff() {
        return interfacesOff;
    }

    public int getAnnotationsOff() {
        return annotationsOff;
    }

    public int getClassDataOff() {
        return classDataOff;
    }

    public int getStaticValuesOff() {
        return staticValuesOff;
    }

    public int getClassTypeRef() {
        return classTypeRef;
    }

    public int getAccessFlag() {
        return accessFlag;
    }

    public int getSuperClassTypeRef() {
        return superClassTypeRef;
    }

    public int getSourceFileNameRef() {
        return sourceFileNameRef;
    }

    public void createClassRef(InputStream inputStream) {
        byte[] buffer4 = new byte[4];
        try {
            inputStream.read(buffer4);
            classTypeRef = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            accessFlag = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            superClassTypeRef = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            interfacesOff = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            sourceFileNameRef = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            annotationsOff = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            classDataOff = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            staticValuesOff = Util.byte4ToInt(buffer4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
