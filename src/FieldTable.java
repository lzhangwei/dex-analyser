import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FieldTable {
    private List<Integer> fieldRefList = new ArrayList<Integer>();
    private List<String> fieldList = new ArrayList<String>();

    public FieldTable() {
    }

    public FieldTable(List<Integer> fieldRefList, List<String> fieldList) {
        this.fieldRefList = fieldRefList;
        this.fieldList = fieldList;
    }

    public List<Integer> getFieldRefList() {
        return fieldRefList;
    }

    public void setFieldRefList(List<Integer> fieldRefList) {
        this.fieldRefList = fieldRefList;
    }

    public List<String> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<String> fieldList) {
        this.fieldList = fieldList;
    }
}
