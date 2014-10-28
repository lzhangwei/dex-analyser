import java.io.IOException;
import java.io.InputStream;

public class DexHeader {
    private RefAndSize stringTable;
    private RefAndSize typeTable;
    private RefAndSize prototypeTable;
    private RefAndSize fieldTable;
    private RefAndSize methodTable;
    private RefAndSize classTable;

    public RefAndSize getStringTable() {
        return stringTable;
    }

    public void setStringTable(RefAndSize stringTable) {
        this.stringTable = stringTable;
    }

    public RefAndSize getTypeTable() {
        return typeTable;
    }

    public void setTypeTable(RefAndSize typeTable) {
        this.typeTable = typeTable;
    }

    public RefAndSize getPrototypeTable() {
        return prototypeTable;
    }

    public void setPrototypeTable(RefAndSize prototypeTable) {
        this.prototypeTable = prototypeTable;
    }

    public RefAndSize getFieldTable() {
        return fieldTable;
    }

    public void setFieldTable(RefAndSize fieldTable) {
        this.fieldTable = fieldTable;
    }

    public RefAndSize getMethodTable() {
        return methodTable;
    }

    public void setMethodTable(RefAndSize methodTable) {
        this.methodTable = methodTable;
    }

    public RefAndSize getClassTable() {
        return classTable;
    }

    public void setClassTable(RefAndSize classTable) {
        this.classTable = classTable;
    }

    public void readHeader(InputStream inputStream) {
        try {
            inputStream.skip(56);
            //string
            stringTable = createRefAndSize(inputStream);
            //type
            typeTable = createRefAndSize(inputStream);
            //prototype
            prototypeTable = createRefAndSize(inputStream);
            //field
            fieldTable = createRefAndSize(inputStream);
            //method
            methodTable = createRefAndSize(inputStream);
            //class
            classTable = createRefAndSize(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private RefAndSize createRefAndSize(InputStream inputStream) {
        RefAndSize result = null;
        byte buffer4[] = new byte[4];
        try {
            inputStream.read(buffer4);
            int size = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            int off = Util.byte4ToInt(buffer4);
            result = new RefAndSize(off,size);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
