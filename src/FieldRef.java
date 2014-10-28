import java.io.IOException;
import java.io.InputStream;

public class FieldRef {
    private int classTypeRef;
    private int fieldTypeRef;
    private int fieldNameRef;

    public FieldRef() {
    }

    public FieldRef(int classTypeRef, int fieldTypeRef, int fieldNameRef) {
        this.classTypeRef = classTypeRef;
        this.fieldTypeRef = fieldTypeRef;
        this.fieldNameRef = fieldNameRef;
    }

    public int getClassTypeRef() {
        return classTypeRef;
    }

    public void setClassTypeRef(int classTypeRef) {
        this.classTypeRef = classTypeRef;
    }

    public int getFieldTypeRef() {
        return fieldTypeRef;
    }

    public void setFieldTypeRef(int fieldTypeRef) {
        this.fieldTypeRef = fieldTypeRef;
    }

    public int getFieldNameRef() {
        return fieldNameRef;
    }

    public void setFieldNameRef(int fieldNameRef) {
        this.fieldNameRef = fieldNameRef;
    }

    public void createFieldRef(InputStream inputStream) {
        byte buffer2[] = new byte[2];
        byte buffer4[] = new byte[4];
        try {
            inputStream.read(buffer2);
            classTypeRef = Util.byte2ToInt(buffer2);
            inputStream.read(buffer2);
            fieldTypeRef = Util.byte2ToInt(buffer2);
            inputStream.read(buffer4);
            fieldNameRef = Util.byte4ToInt(buffer4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
