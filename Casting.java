public class Casting {
    public static void main(String[] args){
        int i = 200;
        long l = (long) i;
        l = i;
        long l2 = (long) 200;
        l2 = 200;
        i = (int) l2;
    }
}
