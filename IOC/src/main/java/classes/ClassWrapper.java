package classes;

/**
 * Т.к. в спринге нельзя связывать примитивы и классы, пришлось нашаманить вот это
 * */
public class ClassWrapper{
    private Class aClass;

    public ClassWrapper(Class aClass) {
        this.aClass=aClass;
    }

    public Class getaClass() {
        return aClass;
    }

    public ClassWrapper setaClass(Class aClass) {
        this.aClass = aClass;
        return this;
    }
}
