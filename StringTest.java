import java.util.Scanner;

public class StringTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sc1,sc2;
        sc1 = scanner.next();
        sc2 = scanner.next();
        System.out.println(sc1 == sc2);
        System.out.println(sc1.equals(sc2));
    }
}
