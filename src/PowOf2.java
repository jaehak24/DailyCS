import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowOf2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long num=Integer.parseInt(br.readLine());
        while(num/2!=0){
            System.out.println(num);
            if(num%2!=0) {System.out.println(); break;}
            num/=2;
        }
        System.out.println("2의 거듭제곱");
    }
}
