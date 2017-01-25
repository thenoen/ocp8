class OverridenMethods2 implements A, B {

    public static void main(String[] args) {
        OverridenMethods2 o = new OverridenMethods2();
        A a = o;
        B b = o;

        a.doOverride(new Integer(3));
        b.doOverride(new Integer(3));
    }

    public void doOverride(Integer i) {
        System.out.println("overriden method");
    }
}

interface A {
    default void doOverride(int i) {
        System.out.println("primitive method");
    }
}

interface B {
    default void doOverride(Integer i) {
        System.out.println("wrapper method");
    }
}