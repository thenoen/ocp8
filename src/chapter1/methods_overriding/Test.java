package chapter1.methods_overriding;

class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A cast = new B();

		a.echo();
		b.echo();

		space();

		a.callEcho();
		b.callEcho();

		space();

		b.callSuperEcho();
		b.callSuperCallEcho();
		cast.callEcho();
		b.callSuperThisEcho();
	}

	private static void space() {
		System.out.println("-------------------");
	}

}

class A {
	void echo() {
		System.out.println("a");
	}

	void callEcho() {
		echo();
	}

	void callThisEcho() {
		this.echo();
	}
}

class B extends A {
	void echo() {
		System.out.println("b");
	}

	void callEcho() {
		echo();
	}

	void callSuperEcho() {
		super.echo();
	}

	void callSuperCallEcho() {
		super.callEcho();
	}

	void callSuperThisEcho() {
		super.callThisEcho();
	}
}