package chapter1.nested_classes;

class AnnonymousInnerClass {

	abstract class A {
	}

	class B {
	}

	A a = new A() {
	};
	B b = new B() {
	};

}