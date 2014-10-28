import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PrototypeTable {
    List<PrototypeRef> prototypeRefList = new ArrayList<PrototypeRef>();
    List<Prototype> prototypeList = new ArrayList<Prototype>();

    public List<PrototypeRef> getPrototypeRefList() {
        return prototypeRefList;
    }

    public void setPrototypeRefList(List<PrototypeRef> prototypeRefList) {
        this.prototypeRefList = prototypeRefList;
    }

    public List<Prototype> getPrototypeList() {
        return prototypeList;
    }

    public void setPrototypeList(List<Prototype> prototypeList) {
        this.prototypeList = prototypeList;
    }

    public PrototypeTable() {
    }

    public PrototypeTable(List<PrototypeRef> prototypeRefList, List<Prototype> prototypeList) {
        this.prototypeRefList = prototypeRefList;
        this.prototypeList = prototypeList;
    }

    public void createPrototypeRefList(InputStream inputStream, int size) {
        for (int i = 0; i < size; i++) {
            PrototypeRef prototypeRef = new PrototypeRef();
            prototypeRef.createPrototypeRef(inputStream);
            prototypeRefList.add(prototypeRef);
        }
    }

    public void createPrototypeList(StringTable stringTable, TypeTable typeTable, InputStream inputStream, int size) {
//        inputStream.skip(prototypeRef.getParameterTypeOff());
        for (int i = 0; i < size; i++) {
            Prototype prototype = new Prototype();
            prototype.createPrototype(prototypeRefList.get(i), stringTable, typeTable, inputStream);
            prototypeList.add(prototype);
        }
    }

    public void addPrototype(StringTable stringTable, TypeTable typeTable, InputStream inputStream, PrototypeRef prototypeRef ) {
        try {
            inputStream.skip(prototypeRef.getParameterTypeOff());
            Prototype prototype = new Prototype();
            prototype.createPrototype(prototypeRef, stringTable, typeTable, inputStream);
            prototypeList.add(prototype);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
