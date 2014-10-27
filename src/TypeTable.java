public class TypeTable {
    private String typeList;
    private int typeStringRef;

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public int getTypeStringRef() {
        return typeStringRef;
    }

    public void setTypeStringRef(int typeStringRef) {
        this.typeStringRef = typeStringRef;
    }

    public TypeTable() {
    }

    public TypeTable(String typeList, int typeStringRef) {
        this.typeList = typeList;
        this.typeStringRef = typeStringRef;
    }
}
