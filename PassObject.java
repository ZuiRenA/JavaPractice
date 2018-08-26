public class PassObject {
    static void f(floatTest y){
        y.f = 2.13f;
    }
    public static void main(String[] args){
        floatTest x = new floatTest();
        x.f = 1.312f;
        System.out.println(x.f);
        f(x);
        System.out.println(x.f);
    }
}
class Letter{char c;}
class floatTest{float f;}
