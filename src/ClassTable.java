import java.util.ArrayList;
import java.util.List;

public class ClassTable {
    private List<ClassRef> classRefList = new ArrayList<ClassRef>();
    private List<Class> classList = new ArrayList<Class>();

    public List<ClassRef> getClassRefList() {
        return classRefList;
    }

    public List<Class> getClassList() {
        return classList;
    }
}
