import java.awt.*;

public class tiling {
    public static void main(String[] args) {
        System.out.println(tiling(2));
        System.out.println(tiling(3));
        System.out.println(tiling(5));
        System.out.println(tiling(50));

    }
    public static int tiling(int num){
        //세로 길이 2
        //가로 길이가 num인 바닥에
        //2X1 크기의 타일을 넣는 경우의 수를 구하시오
        //a(n+1)=a(n)+a(n-1)
        //tiling(n)=tiling(n-1)+tiling(n-2)
        int[] arr;
        arr=new int[num];
        arr[0]=1;
        arr[1]=2;
        if (num>2){
            for (int i=0;i<=num-3;i++){
                arr[i+2]=arr[i]+arr[i+1];
            }
        }
        return arr[num-1];

    }
}
