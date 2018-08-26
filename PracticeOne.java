public class PracticeOne {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        if (b1.aa == b2.a){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        if (b1.aa == b2.aa){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
class A{}
class B{
    static A a = new A();
    A aa = new A();
}
