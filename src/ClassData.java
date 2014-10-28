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
    private List<DexMethod> virtualMethods = new ArrayList<DexMethod>();

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

    public List<DexMethod> getVirtualMethods() {
        return virtualMethods;
    }

    public void createClassData(InputStream inputStream) {
        byte buffer2[] = new byte[2];
        byte buffer4[] = new byte[4];
        try {
            inputStream.read(buffer4);
            staticFieldSize = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            instanceFieldSize = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            directMethodSize = Util.byte4ToInt(buffer4);
            inputStream.read(buffer4);
            virtualMethodSize = Util.byte4ToInt(buffer4);
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
                virtualMethods.add(dexMethod);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
