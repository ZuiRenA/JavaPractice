import java.util.Random;

public class MathOps {
    public static void main(String[] args){
        Random random = new Random();
        int a,b,c;
        a = random.nextInt(100) + 1;
        System.out.println(a);
        b = random.nextInt(100) + 1;
        System.out.println(b);
        c = random.nextInt(100)+ 1;
        a = b + c;
        System.out.println(a);
        a = b - c;
        System.out.println(a);
        a = b/c;
        System.out.println(a);
        a = b*c;
        System.out.println(a);
        a = b%c;
        System.out.println(a);
        b %= c;
        System.out.println(b);
        float u,v,m;
        u = random.nextFloat();
        System.out.println(u);
        v = random.nextFloat();
        System.out.println(v);
        m = random.nextFloat();
        System.out.println(m);
        u = v + m;
        System.out.println(u);
        u += v;
        System.out.println(u);
        u -= v;
        System.out.println(u);
        u *= v;
        System.out.println(u);
        u /= v;
        System.out.println(u);
    }
}
