package chapter1.methodsOverriding;

class OverridenMethods implements A1, B1 {

    public static void main(String[] args) {
        OverridenMethods o = new OverridenMethods();
        A1 a = o;
        B1 b = o;

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

interface A1 {
    default void doStuff() {
        System.out.println("A: doing stuff");
    }

    default void doOverride(int i) {
        System.out.println("primitive method");
    }
}

interface B1 {
    default void doStuff() {
        System.out.println("B: doing stuff");
    }

    default void doOverride(Integer i) {
        System.out.println("wrapper method");
    }
}