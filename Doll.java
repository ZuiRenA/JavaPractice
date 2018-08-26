import java.util.Random;

public class Doll{
    public static void main(String[] args){
        Random random = new Random(1);
        int a = random.nextInt(1);
        int b = random.nextInt(1);
        if (a == 0 && b == 0){
            System.out.println("2次都是正面");
        }else if (a ==1 && b==1){
            System.out.println("2次都是反面");
        }else if(a == 0 && b == 1){
            System.out.print(",第二次投的反面");
        }else if (a == 1 && b == 0){
            System.out.print(",第一次投的反面");
        }
    }
}
