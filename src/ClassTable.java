import java.io.InputStream;
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

    public void createClassRefList(InputStream inputStream, int size) {
        for (int i = 0; i < size; i++) {
            ClassRef classRef = new ClassRef();
            classRef.createClassRef(inputStream);
            classRefList.add(classRef);
        }
    }

    public void addClass(StringTable stringTable, TypeTable typeTable, InputStream inputStream, ClassRef classRef) {
        Class classInfo = new Class();
        classInfo.createClass(classRef, stringTable, typeTable, inputStream);
        classList.add(classInfo);
    }
}
