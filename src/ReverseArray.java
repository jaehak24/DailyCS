import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArray {
    public static void main(String[] args) {

    }
    public static int[] reverseArr(int[] arr){
        // TODO:
        //head 선언
        int[] head= Arrays.copyOfRange(arr,arr.length-2,arr.length-1);
        //tail
        int[] tail=Arrays.copyOfRange(arr,0,arr.length-2);

        //나머지 역전을 재귀로
        int[] result=reverseArr(tail);
        int[] dest=new int[arr.length];

        dest[0]=head[0];

        System.arraycopy(result,0,dest,1,result.length);
        return  dest;


    }

}
