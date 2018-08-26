public class Incrementable {
    public static int i = 47;
    static void increment(){
        Incrementable.i++;
    }
    public static void main(String[] args){
        Incrementable sf = new Incrementable();
        sf.increment();
    }
}
