import java.util.ArrayList;
import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        System.out.println(fibonacci(40));
        long finishTime=System.currentTimeMillis();
        long elapseTime=finishTime-startTime;
        System.out.println("시작 시간"+startTime);
        System.out.println("끝난 시간"+finishTime);
        System.out.println("걸린 시간"+elapseTime);
        //40만 넘어가도 시간 복잡도가 비약적으로 증가
        //40떄 재귀함수 493 ms 걸림
        //동적 계획 법 사용시 1554ms 걸림


    }
    //시간 초과로 동적 계획법을 사용하는 것이 좋음
    public static int fibonacci(int num){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);

        return AUX(arrayList,num);
    }
    public static int AUX(ArrayList<Integer> arrayList,int num){
        //원본은 이전에 한 연산을 중복해서 연산하기 때문에 시간복잡도가 비약적으로 증가
        //즉, 리스트의 사이즈가 num보다 크면 해당 값에 대한 연산을 이미 충족한 거
        //fib(10)=fib(9)+fib(8)
        //=fib(8)+fib(7)+fib(7)+fib(6)에서 7이 반복 -> 이 과정을 삭제
        if(arrayList.size()<=num){
            arrayList.add(AUX(arrayList,num-1)+AUX(arrayList,num-2));
        }
        return arrayList.get(num);
    }
}
