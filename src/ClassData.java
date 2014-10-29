import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ClassData {
    private int staticFieldSize;
    private int instanceFieldSize;
    private int directMethodSize;
    private int virtualMethodSize;
    private List<DexField> staticFieldList = new ArrayList<DexField>();
    private List<DexField> instanceFieldList = new ArrayList<DexField>();
    private List<DexMethod> directMethodList = new ArrayList<DexMethod>();
    private List<DexMethod> virtualMethodList = new ArrayList<DexMethod>();

    public int getStaticFieldSize() {
        return staticFieldSize;
    }

    public int getInstanceFieldSize() {
        return instanceFieldSize;
    }

    public int getDirectMethodSize() {
        return directMethodSize;
    }

    public int getVirtualMethodSize() {
        return virtualMethodSize;
    }

    public List<DexField> getStaticFieldList() {
        return staticFieldList;
    }

    public List<DexField> getInstanceFieldList() {
        return instanceFieldList;
    }

    public List<DexMethod> getDirectMethodList() {
        return directMethodList;
    }

    public List<DexMethod> getVirtualMethodList() {
        return virtualMethodList;
    }

    public void createClassData(InputStream inputStream) {
        byte buffer2[] = new byte[2];
        byte buffer4[] = new byte[4];
        byte buffer1[] = new byte[1];
        try {
            inputStream.read(buffer1);
            staticFieldSize = Util.byteToInt(buffer1);
            inputStream.read(buffer1);
            instanceFieldSize = Util.byteToInt(buffer1);
            inputStream.read(buffer1);
            directMethodSize = Util.byteToInt(buffer1);
            inputStream.read(buffer1);
            virtualMethodSize = Util.byteToInt(buffer1);
            for (int i = 0; i < staticFieldSize; i++) {
                DexField dexField = new DexField();
                dexField.createDexField(inputStream);
                staticFieldList.add(dexField);
            }
            for (int i = 0; i < instanceFieldSize; i++) {
                DexField dexField = new DexField();
                dexField.createDexField(inputStream);
                instanceFieldList.add(dexField);
            }
            for (int i = 0; i < directMethodSize; i++) {
                DexMethod dexMethod = new DexMethod();
                dexMethod.createDexMethod(inputStream);
                directMethodList.add(dexMethod);
            }
            for (int i = 0; i < virtualMethodSize; i++) {
                DexMethod dexMethod = new DexMethod();
                dexMethod.createDexMethod(inputStream);
                virtualMethodList.add(dexMethod);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String result = "";
        result += "静态字段个数：" + staticFieldSize + ";";
        result += "实例字段个数：" + instanceFieldSize + ";";
        result += "直接方法个数：" + directMethodSize + ";";
        result += "虚方法个数：" + virtualMethodSize + ";";
        for (int i = 0; i < staticFieldSize; i++) {
            result += "静态字段" +  (i+1) + ":" + staticFieldList.get(i).toString();
        }
        for (int i = 0; i < instanceFieldSize; i++) {
            result += "实例字段" +  (i+1) + ":" + instanceFieldList.get(i).toString();
        }
        for (int i = 0; i < directMethodSize; i++) {
            result += "直接方法" +  (i+1) + ":" + directMethodList.get(i).toString();
        }
        for (int i = 0; i < virtualMethodSize; i++) {
            result += "虚方法" +  (i+1) + ":" + virtualMethodList.get(i).toString();
        }

        return result;
    }
}
