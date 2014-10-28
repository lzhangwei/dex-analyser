public class Method {
    private String classType;
    private Prototype prototype;
    private String methodName;

    public String getClassType() {
        return classType;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public String getMethodName() {
        return methodName;
    }

    public Method() {
    }

    public void createMethod(MethodRef methodRef, TypeTable typeTable, PrototypeTable prototypeTable, StringTable stringTable) {
        classType = typeTable.getTypeList().get(methodRef.getClassTypeRef());
        prototype = prototypeTable.getPrototypeList().get(methodRef.getPrototypeRef());
        methodName = stringTable.getStringList().get(methodRef.getMethodNameRef());
    }

    public String toString() {
        String result = "";
        result += "类类型：" + classType + ";";
        result += "原型：" + prototype.toString() + ";";
        result += "方法名：" + methodName + "  ";
        return result;
    }
}
