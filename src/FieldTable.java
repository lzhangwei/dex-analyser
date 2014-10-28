import java.util.ArrayList;
import java.util.List;

public class FieldTable {
    private List<Integer> classTypeListRef = new ArrayList<Integer>();
    private List<String> classTypeList = new ArrayList<String>();
    private List<Integer> fieldTypeListRef = new ArrayList<Integer>();
    private List<String> fieldTypeList = new ArrayList<String>();
    private List<Integer> fieldNameListRef = new ArrayList<Integer>();
    private List<String> fieldNameList = new ArrayList<String>();

    public List<Integer> getClassTypeListRef() {
        return classTypeListRef;
    }

    public void setClassTypeListRef(List<Integer> classTypeListRef) {
        this.classTypeListRef = classTypeListRef;
    }

    public List<String> getClassTypeList() {
        return classTypeList;
    }

    public void setClassTypeList(List<String> classTypeList) {
        this.classTypeList = classTypeList;
    }

    public List<Integer> getFieldTypeListRef() {
        return fieldTypeListRef;
    }

    public void setFieldTypeListRef(List<Integer> fieldTypeListRef) {
        this.fieldTypeListRef = fieldTypeListRef;
    }

    public List<String> getFieldTypeList() {
        return fieldTypeList;
    }

    public void setFieldTypeList(List<String> fieldTypeList) {
        this.fieldTypeList = fieldTypeList;
    }

    public List<Integer> getFieldNameListRef() {
        return fieldNameListRef;
    }

    public void setFieldNameListRef(List<Integer> fieldNameListRef) {
        this.fieldNameListRef = fieldNameListRef;
    }

    public List<String> getFieldNameList() {
        return fieldNameList;
    }

    public void setFieldNameList(List<String> fieldNameList) {
        this.fieldNameList = fieldNameList;
    }

    public FieldTable() {
    }

    public FieldTable(List<Integer> classTypeListRef, List<String> classTypeList, List<Integer> fieldTypeListRef, List<String> fieldTypeList, List<Integer> fieldNameListRef, List<String> fieldNameList) {
        this.classTypeListRef = classTypeListRef;
        this.classTypeList = classTypeList;
        this.fieldTypeListRef = fieldTypeListRef;
        this.fieldTypeList = fieldTypeList;
        this.fieldNameListRef = fieldNameListRef;
        this.fieldNameList = fieldNameList;
    }
}
