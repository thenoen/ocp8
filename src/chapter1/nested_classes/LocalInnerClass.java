public class LocalInnerClass {

    private String instanceField = "instanceField";
    public Object getLocalInnerInstance() {

        String effectivelyFinal = "effectivelyFinal";
        String notFinal = "notFinal";

        String beforeClassA = "beforeClassA";

        class A {

            // public A() {}

            String a = effectivelyFinal;
            String b = notFinal;
            String c = beforeClassA;
            // String d = afterClassA; // not available
        }

        abstract class B {}

        String afterClassA = "afterClassA";

        // not allowed by compiler: error: local variables referenced from an inner class must be final or effectively final
        // notFinal = "change";

        A a = new A();
        return a;
    }

}