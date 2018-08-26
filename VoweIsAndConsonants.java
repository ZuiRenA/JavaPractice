import java.util.Random;

public class VoweIsAndConsonants {
    public static void main(String[] args){
        Random rand = new Random(26);
        for (int i = 0; i < 100; i++){
            int c = rand.nextInt();
            System.out.println((char)c + "," + c + ":");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    break;
            }
        }
    }
}
