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
}
