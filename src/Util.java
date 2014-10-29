import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Util {

    public static int byte4ToInt(byte[] ary) {
        return ary[0] & 0xFF |
                (ary[1] & 0xFF) << 8 |
                (ary[2] & 0xFF) << 16 |
                (ary[3] & 0xFF) << 24;
    }

    public static int byte2ToInt(byte[] ary) {
        return ary[0] & 0xFF |
                (ary[1] & 0xFF) << 8;
    }

    public static int byteToInt(byte[] ary) {
        return ary[0] & 0xFF;
    }
}
