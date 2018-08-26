public class AutoInc {
    public static void main(String[] args){
        value v1 = new value();
        value v2 = new value();
        v1.i = v2.i = 45;
        System.out.println(v1.equals(v2));
    }
}
class value{
    int i;
}
