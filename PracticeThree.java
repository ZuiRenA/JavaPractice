import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a,b,c;
        try {
            a = scanner.next();
            b = scanner.next();
            c = scanner.next();
            System.out.println(c);
        }catch (InputMismatchException e){
            System.out.println("input error");
            e.printStackTrace();
        }
        scanner.close();
    }
}
