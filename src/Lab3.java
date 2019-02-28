
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.lang.String;
public class Lab3 {
    public static void main(String[] args) {
        String str[] = {"a", "ab", "abc" ,"abcd"};
        Random r = new Random();
        int i = r.nextInt(3);
        System.out.println("string:"+str[i]);
        for (int j =0 ; j<10; j++)
        {
            i = r.nextInt(3);
            System.out.println(str[i]);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }
}
