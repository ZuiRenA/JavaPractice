
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class DataOnly {
    class AAa{
        int i;
        double d;
        boolean b;
    }
    AAa data = new AAa();
    public DataOnly(){
        data.i = 47;
        data.d = 1.1;
        data.b = true;
        System.out.println(data.i +" " + data.d);
    }
    int storage(String s){
        return s.length() * 2;
    }
    public static void main(String[] args) throws IOException {
        new DataOnly();
    }

}

