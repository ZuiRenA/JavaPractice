import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        bark a = new bark(1);
        System.out.println(new bark());
    }
}
class bark{
    bark(){
        System.out.println("barking");
    }
    bark(int a){
        System.out.println("howling");
    }
}
