public class TernaryIfElse {
    static int TernaryIfElse(int i){
        return i<10 ? i*100 : i * 10;
    }
    static int StandardIfElse(int i){
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }
    public static void main(String[] args){
        System.out.println(TernaryIfElse(TernaryIfElse(9)));
        System.out.println(TernaryIfElse(TernaryIfElse(100)));
        System.out.println(TernaryIfElse(StandardIfElse(8)));
        System.out.println(TernaryIfElse(StandardIfElse(90)));
    }
}
