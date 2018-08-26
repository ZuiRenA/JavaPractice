import java.util.Scanner;

public class ListCharacters {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean Right (int n){
        for (int i = 2; i<10; i++){
            if (n % i == 0){
                return false;
            }else if (n == 2 || n == 3 || n == 1){
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int inputNumber = scanner.nextInt();
        if (Right(inputNumber)){
            System.out.println("是素数");
        }else {
            System.out.println("不是素数");
        }
    }
}