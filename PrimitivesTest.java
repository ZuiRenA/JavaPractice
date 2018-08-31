public class PrimitivesTest {
    //StringPrint[] array1 = new StringPrint[5];
    //public static String[] b = {"These","are","some","strings"};
    public static void main(String[] args){
        /*
        String[] a = {"a","b","c","d"};
        for (int i = 0; i < a.length; i++){
            System.out.println("a[" + i +"] = " + a[i]);
        }
        */
        /*
        String[] sal = new String[4];
        for (int i = 0; i < sal.length; i++){
            sal[i] = b[i];
            System.out.println(sal[i]);
        }
        String[] sal2 = {
                "These","are","some","strings"
        };
        for (int i = 0; i < sal2.length; i++){
            System.out.println(sal2[i]);
        }
        */
        StringPrint[] array = new StringPrint[5];
        for (int i = 0; i < array.length; i++){
            array[i] = new StringPrint(Integer.toString(i));
        }

    }
}
class StringPrint{
    StringPrint(String a){
        System.out.println("String constructor: a = " + a);
    }
}