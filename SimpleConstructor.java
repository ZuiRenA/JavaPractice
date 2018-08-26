public class SimpleConstructor {
    public static void main (String[] args) {
        String a = "";
        String b = null;
        new Rock(a,b);
    }
}

class Rock{
    Rock(String a ,String b){
        a = null;
        System.out.println(a + b);
    }
}

