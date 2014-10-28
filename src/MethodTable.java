import java.io.InputStream;
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

    public void createMethodRefList(InputStream inputStream, int size) {
        for (int i = 0; i < size; i++) {
            MethodRef methodRef = new MethodRef();
            methodRef.createMethodRef(inputStream);
            methodRefList.add(methodRef);
        }
    }

    public void addMethodList(StringTable stringTable, TypeTable typeTable,PrototypeTable prototypeTable, MethodRef methodRef) {
        Method method = new Method();
        method.createMethod(methodRef, typeTable, prototypeTable, stringTable);
        methodList.add(method);
    }
}

