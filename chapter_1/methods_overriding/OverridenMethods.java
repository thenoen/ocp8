class OverridenMethods implements A, B {

    public static void main(String[] args) {
        OverridenMethods o = new OverridenMethods();
        A a = o;
        B b = o;

        a.doStuff();
        b.doStuff();

        a.doOverride(3);
        a.doOverride(new Integer(3));

        b.doOverride(3);
        b.doOverride(new Integer(3));        
    }

    public void doStuff() {
        System.out.println("Overriden: doing stuff");
    }

    public void doOverride(Integer i) {
        System.out.println("overriden method");
    }
}

interface A {
    default void doStuff() {
        System.out.println("A: doing stuff");
    }

    default void doOverride(int i) {
        System.out.println("primitive method");
    }
}

interface B {
    default void doStuff() {
        System.out.println("B: doing stuff");
    }

    default void doOverride(Integer i) {
        System.out.println("wrapper method");
    }

    default void doOverride(int i) {
        System.out.println("primitive method - B");
    }
}