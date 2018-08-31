import java.util.*;
public class ArraysOfPrimitives {
    public static void main(String[] args){
        /*
        int[] a1 = {1,2,3,4,5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++){
            a2[i] = a2[i] + 1;
        }
        for (int i = 0; i < a1.length; i++){
            System.out.println("a1[" + i + "] = " + a1[i]);
        }
        */
        /*
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        System.out.println("length = " + a.length);
        System.out.println(Arrays.toString(a));
        */
        /*
        Random random = new Random(30);
        Integer[] a;
        a = new Integer[random.nextInt(20)];
        System.out.println("length = " + a.length);
        for (int i = 0; i < a.length; i++){
            a[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
        */
        /*
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        */
        Other.main(new String[]{"fiddle","de","dum"});
    }
}
class Other{
    public static void main(String[] args){
        for (String s : args){
            System.out.println(s + " ");
        }
    }
}
