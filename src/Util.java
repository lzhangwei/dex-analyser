import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Util {

    public static int bytesToInt(byte[] bytes) {
        int result = 0;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            result = Integer.reverseBytes(dataInputStream.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayInputStream.close();
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return result;
    }
}
