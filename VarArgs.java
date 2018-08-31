public class VarArgs {
    /*  NO.1
    static void printArray(Object[] args){
        for (Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    */
    /* NO.2
    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println(" length: " + args.length);
    }
    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length: " + args.length);
    }
    */
    public static void f(Integer... args){
        for (Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        f(new Integer(1), new Integer(2));
        f(3,4,5,6,7,8,9);
        f(10,new Integer(11));
        /* NO.2
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
        */
        /* NO.1
        printArray(new Object[]{
                new Integer(47),new Float(3.14),new Double(11.11)
        });
        printArray(new Object[]{
                "one","two","three"
        });
        printArray(new Object[]{
                new A1(),new A1(),new A1()
        });
        */
    }
}
class A1{}
