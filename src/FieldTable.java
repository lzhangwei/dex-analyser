import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FieldTable {
    private List<FieldRef> fieldRefList = new ArrayList<FieldRef>();
    private List<Field> fieldList = new ArrayList<Field>();

    public FieldTable() {
    }

    public FieldTable(List<FieldRef> fieldRefList, List<Field> fieldList) {
        this.fieldRefList = fieldRefList;
        this.fieldList = fieldList;
    }

    public List<FieldRef> getFieldRefList() {
        return fieldRefList;
    }

    public void setFieldRefList(List<FieldRef> fieldRefList) {
        this.fieldRefList = fieldRefList;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

    public void createFieldRefList(InputStream inputStream, int size) {
        for (int i = 0; i < size; i++) {
            FieldRef fieldRef = new FieldRef();
            fieldRef.createFieldRef(inputStream);
            fieldRefList.add(fieldRef);
        }
    }
}
