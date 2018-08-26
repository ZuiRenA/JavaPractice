import java.util.Scanner;

public class Test {
    public static int count = 0;
    public static int k = 0;
    public static void main(String[] args){
        for (int i = 1001; i < 10000; i++){
            if (i % 10 == 0) continue;
            int a = i/1000;
            int b = (i - a*1000)/100;
            int c = (i - a*1000 - b*100)/10;
            int d = i - a*1000 - b*100 - c*10;
            if (b + c + d == c || b + c + d == d)continue;
            if (search(i,a,b,c,d)){
            }else if (search(i, a, b, d, c)) {
            }else if (search(i, a, c, b, d)) {
            }else if (search(i, a, c, d, b)) {
            }else if (search(i, a, d, b, c)) {
            }else if (search(i, a, d, c, b)) {
            }else if (search(i, b, a, c, d)) {
            }else if (search(i, b, a, d, c)) {
            }else if (search(i, b, c, d, a)) {
            }else if (search(i, b, d, c, a)) {
            }else if (search(i, c, a, d, b)) {
            }else if (search(i, c, b, d, a)) {
            }
            System.out.println("四位数的吸血鬼数字一共有" + count + "个。");
            System.out.println("一共调用判断次数为" + k);
        }
    }
    static boolean search(int i,int a,int b,int c,int d){
        k++;
        if ((a * 10 + b) * (c * 10 +d) == i){
            searchfor(i,a,b,c,d);
            return true;
        }else {
            return false;
        }
    }

    private static void searchfor(int i, int a, int b, int c, int d) {
        count++;
        System.out.println(i + "=" + (a * 10 + b) + "*" + (c * 10 + d));
    }
}
