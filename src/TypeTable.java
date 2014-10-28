import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TypeTable {
    private List<String> typeList = new ArrayList<String>();
    private List<Integer> typeStringRef = new ArrayList<Integer>();

    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public List<Integer> getTypeStringRef() {
        return typeStringRef;
    }

    public void setTypeStringRef(List<Integer> typeStringRef) {
        this.typeStringRef = typeStringRef;
    }

    public TypeTable() {
    }

    public TypeTable(List<String> typeList, List<Integer> typeStringRef) {
        this.typeList = typeList;
        this.typeStringRef = typeStringRef;
    }

    public void addTypeList(String type) {
        typeList.add(type);
    }

    public void addTypeStringRef(int ref) {
        typeStringRef.add(ref);
    }

    public int getTypeStringRef(int i) {
        return typeStringRef.get(i);
    }

    public void createTypeStringRef(InputStream inputStream, int size) {
        byte buffer4[] = new byte[4];
        try {
            for (int i = 0; i < size; i++) {
                inputStream.read(buffer4);
                typeStringRef.add(Util.byte4ToInt(buffer4));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
