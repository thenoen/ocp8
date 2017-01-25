package chapter1.methods_overriding;

class OverridenMethods2 implements A2, B2 {

	public static void main(String[] args) {
		OverridenMethods2 o = new OverridenMethods2();
		A2 a = o;
		B2 b = o;

		a.doOverride(new Integer(3));
		b.doOverride(new Integer(3));
	}

	public void doOverride(Integer i) {
		System.out.println("overriden method");
	}
}

interface A2 {
	default void doOverride(int i) {
		System.out.println("primitive method");
	}
}

interface B2 {
	default void doOverride(Integer i) {
		System.out.println("wrapper method");
	}
}