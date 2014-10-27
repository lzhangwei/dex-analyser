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
        byte buffer4[] = new byte[4];
        try {
            inputStream.skip(56);
            //string
            stringTable = createRefAndSize(inputStream,buffer4);
            //type
            typeTable = createRefAndSize(inputStream,buffer4);
            //prototype
            prototypeTable = createRefAndSize(inputStream,buffer4);
            //field
            fieldTable = createRefAndSize(inputStream,buffer4);
            //method
            methodTable = createRefAndSize(inputStream,buffer4);
            //class
            classTable = createRefAndSize(inputStream,buffer4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private RefAndSize createRefAndSize(InputStream inputStream, byte buffer4[]) {
        RefAndSize result = new RefAndSize();
        try {
            inputStream.read(buffer4, 0, 4);
            byte sizes[] = buffer4;
            int size = Util.bytesToInt(sizes);
            inputStream.read(buffer4, 0, 4);
            byte offs[] = buffer4;
            int off = Util.bytesToInt(offs);
            result = new RefAndSize(off,size);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
