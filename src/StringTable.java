import java.util.ArrayList;
import java.util.List;

public class StringTable {
    private List<Integer> stringListRef = new ArrayList<Integer>();
    private List<String> stringList = new ArrayList<String>();

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<Integer> getStringListRef() {
        return stringListRef;
    }

    public void setStringListRef(List<Integer> stringListRef) {
        this.stringListRef = stringListRef;
    }

    public void addStringList(String str) {
        stringList.add(str);
    }

    public void addStringListRef(int ref) {
        stringListRef.add(ref);
    }

    public int getStringRef(int i) {
        return stringListRef.get(i);
    }

}
