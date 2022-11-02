import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class orderOfPresentation {
    public static void main(String[] args) {
        System.out.println(orderOfPresentation(3, new int[]{2,3,1}));

    }

    public static int orderOfPresentation(int N, int[] K){

        int count=0;

        //수의 정렬에 있어서 첫쨰 값 부터 차근차근 넘어가고 오름차순으로 진행되지 않은 수가 있으면
        //오름차순에서 벗어난 만큼 factorial 계산을 해서 더해 주면 됨
        //ex> 1,2,4,5,3 면
        //1> 4가 3에서 1만큼 벗어났으므로 2! 계산
        //2> 5가 3에서 1순서만큼 벗어났으므로 1! 계산
        //0,1,2,3번쨰 숫자
        //즉, 이를 판별하기 위한 숫자의 낙인화가 필요
        boolean[] Visited=new boolean[N+1];

        for (int i=0;i<K.length;i++){
            int num=K[i];
            Visited[num]=true;

            //num 보다 앞에 올 수 있는 후보들
            boolean[] candidates=Arrays.copyOfRange(Visited,1,num);

            //이 중에서 아직 사용되지 않은 수의 개수를 구합니다.
            int validCount=0;
            //ex> num=1
            //candidates=
            for (boolean candidate: candidates)if(!candidate) validCount++;

            int cnt=validCount*factorial(N-i-1);
            count=count+cnt;

        }


        return count;
    }

    public static int factorial(int n){
        //n개 만큼의 배열 선언
        int arr[]=new int[n+1];
        arr[0]=1;
        for (int i=0;i<n;i++) {
            arr[i + 1] = arr[i] * (i + 1);
        }
        return arr[n];
    }
}
