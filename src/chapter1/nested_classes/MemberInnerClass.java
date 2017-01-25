package chapter1.nested_classes;

public class MemberInnerClass {

	private String instanceText = "instanceText";

	// This is "member inner class"
	class A {
	}

	// This is NOT "member inner class" but "static nested class"
	static class B {
		// String bField = instanceText; // instanceText cant be accessed without instance of MemberInnerClass
		static String bStaticField = "bStaticField";
	}

	public static class B2 {
		static String b2StaticField = "b2StaticField";
	}

	private class C {
	}

	protected class D {
	}

	public class E {
	}

	class F {
		// static methods/members are not allowed
		// static String A = "xxx";
	}

	abstract class G {
		abstract void method();

		final void method2() {
		}

		;
	}

	final class H {
	}

	public class PrivateFieldUser {

		void printOuterPrivateField() {
			System.out.println(new B().getClass());
			System.out.println(instanceText);
		}
	}

}