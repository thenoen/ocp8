

public class MainClass {

    public static void main(String[] args) {
        MemberInnerClass mic = new MemberInnerClass();

        MemberInnerClass.PrivateFieldUser pfu = mic.new PrivateFieldUser();

        pfu.printOuterPrivateField();
    }

}