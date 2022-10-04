import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] out=reverseArr(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(out));

    }
    public static int[] reverseArr(int[] arr){
        if (arr.length==0)return arr;
        //입력 문자열의 맨 앞 위치의 문자를 head에 저장
        int[] head=Arrays.copyOfRange(arr,arr.length-1,arr.length);
        //head 부분을 제외한 배열의 나머지 부분을 저장
        int[] tail=Arrays.copyOfRange(arr,0,arr.length-1);
        //tail을 뒤집어서 저장하는 배열 result 버퍼
        int[] result=reverseArr(tail);

        //출력에 사용할 배열 정의
        int Len=head.length+tail.length;
        int[] arr2=new int[Len];

        arr2[0]=head[0];
        //return 문에 사용할 배열 정의
        System.arraycopy(result,0,arr2,1,result.length);
        return arr2;





    }

}
