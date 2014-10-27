import java.util.ArrayList;
import java.util.List;

public class StringTable {
    private List<Long> stringListRef = new ArrayList<Long>();
    private List<String> stringList = new ArrayList<String>();

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<Long> getStringListRef() {
        return stringListRef;
    }

    public void setStringListRef(List<Long> stringListRef) {
        this.stringListRef = stringListRef;
    }

    public void addStringList(String str) {
        stringList.add(str);
    }

    public void addStringListRef(Long ref) {
        stringListRef.add(ref);
    }

}
