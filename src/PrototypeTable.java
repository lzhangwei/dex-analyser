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
}
