public class VarargsTest {
    static void f(String... strs){
        for (String s : strs){
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        f("These","are","some","strings");
        f(
                new String[] {"These","are","some","strings"}
        );
        VarargsTest.f(args);

    }
}
