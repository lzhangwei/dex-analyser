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
}
