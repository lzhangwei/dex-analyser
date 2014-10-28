public class ClassRef {
    private int classTypeRef;
    private int accessFlag;
    private int superClassTypeRef;
    private int interfacesOff;
    private int sourceFileNameRef;
    private int annotationsOff;
    private int classDataOff;
    private int staticValuesOff;

    public int getInterfacesOff() {
        return interfacesOff;
    }

    public int getAnnotationsOff() {
        return annotationsOff;
    }

    public int getClassDataOff() {
        return classDataOff;
    }

    public int getStaticValuesOff() {
        return staticValuesOff;
    }

    public int getClassTypeRef() {
        return classTypeRef;
    }

    public int getAccessFlag() {
        return accessFlag;
    }

    public int getSuperClassTypeRef() {
        return superClassTypeRef;
    }

    public int getSourceFileNameRef() {
        return sourceFileNameRef;
    }

}
