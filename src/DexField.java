import java.io.IOException;
import java.io.InputStream;

public class DexField {
    private int fieldRef;
    private int accessFlag;

    public int getAccessFlag() {
        return accessFlag;
    }

    public int getFieldRef() {
        return fieldRef;
    }

    public void createDexField(InputStream inputStream) {
        byte buffer4[] = new byte[4];
        try {
            inputStream.read(buffer4);
            fieldRef = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            accessFlag = Util.byte4ToInt(buffer4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
