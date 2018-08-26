import java.util.Scanner;

public class IfElse {
    static boolean test(int testval, int begin, int end){
        if (testval >= begin && testval<= end){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testval = scanner.nextInt();
        System.out.println(test(testval,5,10));
    }
}
