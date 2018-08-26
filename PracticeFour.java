public class PracticeFour {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 1;
        t2.level = 5;
        System.out.println(t1.level + " " + t2.level);
        t1.level = t2.level;
        System.out.println(t1.level + " " + t2.level);
        t1.level =27;
        System.out.println(t1.level + " " + t2.level);
    }
}
class Tank{
    int level;
}
