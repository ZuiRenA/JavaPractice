public class Test2 {
    /*
    static int a;
    int b;
    static int c;
    public int aMethod(){
        a++;
        return a;
    }
    public int bMethod(){
        b++;
        return b;
    }
    public static int cMethod(){
        c++;
        return c;
    }*/
    int count = 21;
    public void count(){
        System.out.println(++count);
    }
    public static void main(String[] args){
        /*
        Test2 test1 = new Test2();
        test1.aMethod();
        System.out.println(test1.aMethod());
        Test2 test2 = new Test2();
        test2.bMethod();
        System.out.println(test2.bMethod());
        Test2 test3 = new Test2();;
        test3.cMethod();
        System.out.println(test3.cMethod());
        */
        new Test2().count();
        new Test2().count();
    }

}
