public class OverloadingOrder {
    public static void main(String[] args){
        PrimitiveOverloading p = new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
        p.testShort();
        p.testFloat();
        p.testInt();
        p.testLong();
    }

}
class PrimitiveOverloading{
    void f1(char x){ System.out.println("f1(char)"); }
    void f1(int x){ System.out.println("f1(int)"); }
    void f1(short x){ System.out.println("f1(short)"); }
    void f1(long x){ System.out.println("f1(long)"); }
    void f1(float x){ System.out.println("f1(float)"); }

    void f2(char x){ System.out.println("f2(char)"); }
    void f2(int x){ System.out.println("f2(int)"); }
    void f2(short x){ System.out.println("f2(short)"); }

    void f3(char x){ System.out.println("f3(char)"); }
    void f3(int x){ System.out.println("f3(int)"); }

    void f4(int x){System.out.println("f4(int)");}

    void testConstVal(){
        System.out.println("5: ");
        f1(5);f2(5);f3(5);
    }
    void testChar(){
        char x = 'x';
        System.out.println("char: ");
        f1(x);f2(x);f3(x);
    }
    void testShort(){
        short x = 0;
        System.out.println("short: ");
        f1(x);f2(x);
    }
    void testInt(){
        int x = 0;
        System.out.println("int: ");
        f1(x);f2(x);f3(x);f4(x);
    }
    void testLong(){
        long x = 0;
        System.out.println("long: ");
        f1(x);
    }
    void testFloat(){
        float x = 0;
        System.out.println("float: ");
        f1(x);
    }
}
