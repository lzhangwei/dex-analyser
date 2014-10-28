public class Field {
    private String classType;
    private String fieldType;
    private String fieldName;

    public Field() {
    }

    public Field(String classType, String fieldName, String fieldType) {
        this.classType = classType;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
