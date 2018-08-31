public class Practice15 {
    Mug15 mug1;
    Mug15 mug2;
    {
        mug1 = new Mug15(1);
        mug2 = new Mug15(2);
        System.out.println("do it");
    }
    Practice15(){
        System.out.println("Mugs()");
    }
    public static void main(String[] args){
        System.out.println("inside main()");
        System.out.println(1);
        new Practice15();
    }
}
class Mug15{
    Mug15(int marker){
        System.out.println("Mug15(" + marker + ")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}

