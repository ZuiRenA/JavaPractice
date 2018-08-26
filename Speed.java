import java.util.Scanner;
public class Speed {
    private static int distance;
    private static int time;
    private static int speed;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        distance = scanner.nextInt();
        time = scanner.nextInt();
        speed = distance/time;
        System.out.println(speed);
    }
}
