public class MemberInnerClass {

    private String instanceText = "instanceText";

    // This is "member inner class"
    class A {}
    static class B {}
    private class C {}
    protected class D {}
    public class E {}

    class F {
        // static methods/members are not allowed
        // static String A = "xxx";
    }

    abstract class G {
        abstract void method ();

        final void method2 () {};
    }

    final class H {}

    public class PrivateFieldUser {

        void printOuterPrivateField() {
            System.out.println(instanceText);
        }
    }

}