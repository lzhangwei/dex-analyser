import java.io.IOException;
import java.io.InputStream;

public class DexMethod {
    private int methodRef;
    private int accessFlag;
    private int codeOff;

    public int getMethodRef() {
        return methodRef;
    }

    public int getAccessFlag() {
        return accessFlag;
    }

    public int getCodeOff() {
        return codeOff;
    }

    public void createDexMethod(InputStream inputStream) {
        byte buffer4[] = new byte[4];
        try {
            inputStream.read(buffer4);
            methodRef = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            accessFlag = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            codeOff = Util.byte4ToInt(buffer4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String result = "";
        result += "Method索引：" + methodRef + ";";
        result += "访问标志：" + accessFlag + ";";
        result += "CodeOff:" + codeOff;
        return result;
    }
}
