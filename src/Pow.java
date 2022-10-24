public class Pow {
    public static void main(String[] args) {
        long output = Power(3, 40);
        System.out.println(output); // --> 19334827

    }

    public static long Power(int base, int exponent){

        //반복문을 사용해서 base를 exponent만큼 곱하면 시간복잡도는 O(n)이 된다.

        //지수가 0이면 1을 리턴
        if(exponent==0) return 1;

        //지수를 반으로 나누면 시간복잡도가 비약적으로 줄어든다.
        long res=Power(base,exponent/2);
        //System.out.println(res);

        if(exponent%2==0) {
            //System.out.println(res*res%94906249);
            return res*res%94906249;

        }
        else {
            //System.out.println(res*res*base%94906249);
            return res*res*base%94906249;}

    }
}
