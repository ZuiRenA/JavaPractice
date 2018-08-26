public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void PrintInitialValues(){
        System.out.println("boolean   " + t);
        System.out.println("char      " + c);
        System.out.println("byte      " + b);
        System.out.println("int       " + i);
        System.out.println("long      " + l);
        System.out.println("float     " + f);
        System.out.println("double    " + d);
        System.out.println("reference " + reference);
    }
    public class MethodInit{
        int i = f();
        int f(){return 11;}
    }
    public class MethodInit2{
        int i = f();
        int j = g(i);
        int f() {return 11;}
        int g(int n){return n * 10;}
    }
    public class MethodInit3{
        int i = f();
        int f(){return 11;}
        int g(int n){return n * 10;}
    }
    public static void main(String[] args){
        InitialValues initialValues = new InitialValues();
        initialValues.PrintInitialValues();
        Depth d = new Depth();
    }
}
class Depth{

}
