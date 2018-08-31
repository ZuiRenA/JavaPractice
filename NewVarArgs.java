public class NewVarArgs {
    /*
    static void printArray(Object... args){
        for (Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    */
    static void f(int required,String... trailing){
        System.out.print("required:"  + required + " ");
        for (String s : trailing){
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        /*
        printArray(new Integer(47),new Float(3.14),new Double(11.11));
        printArray(47,3.14f,11.11);
        printArray("one","two","three");
        printArray(new A1(),new A1(),new A1());
        printArray((Object[]) new Integer[]{1,2,3,4});
        printArray();
        */
        f(1,"one");
        f(2,"two","three");
        f(0);
    }
}
