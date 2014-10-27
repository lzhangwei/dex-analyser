public class DexHeader {
    private RefAndSize stringTable;
    private RefAndSize typeTable;
    private RefAndSize protoTable;
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

    public RefAndSize getProtoTable() {
        return protoTable;
    }

    public void setProtoTable(RefAndSize protoTable) {
        this.protoTable = protoTable;
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
}
