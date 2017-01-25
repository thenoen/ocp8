package chapter1.nested_classes;

// import MemberInnerClass.B2; //not possible, has to be in package

import static chapter1.nested_classes.somepackage.ClassWithStaticNestedClass.StaticNestedClass; // keyword static is optional

public class MainClass {

	public static void main(String[] args) {
		tryMemberInnerClass();
		tryLocalInnerClass();
	}

	private static void tryMemberInnerClass() {
		MemberInnerClass mic = new MemberInnerClass();
		MemberInnerClass.PrivateFieldUser pfu = mic.new PrivateFieldUser();
		pfu.printOuterPrivateField();
	}

	private static void tryLocalInnerClass() {
		LocalInnerClass lci = new LocalInnerClass();
		Object o = lci.getLocalInnerInstance();
		System.out.println(o.getClass().getSimpleName());

		String s = MemberInnerClass.B.bStaticField;
		MemberInnerClass.B mib = new MemberInnerClass.B();
		// B2 b2 = new B2(); // see imports
		MemberInnerClass.B2 b2 = new MemberInnerClass.B2();

		StaticNestedClass snc = new StaticNestedClass();

		StaticClass sc = new StaticClass(); // it is not static
	}

}