import java.util.ArrayList;
import java.util.List;

public class MethodTable {
    private List<MethodRef> methodRefList = new ArrayList<MethodRef>();
    private List<Method> methodList = new ArrayList<Method>();

    public List<MethodRef> getMethodRefList() {
        return methodRefList;
    }

    public List<Method> getMethodList() {
        return methodList;
    }

    
}

