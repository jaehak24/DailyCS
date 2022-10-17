import java.util.ArrayList;
import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int output = maximum(new int[]{2, 1, 3, 7,-6,-2,-8});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)
    }
    public static int maximum(int[] arr){
        int result=0;

        //배열을 오름차순으로 정렬
        //모든 수가 음수일 때, 양수일 때 모두 오름차순으로 정렬하면 이해하기 편함
        Arrays.sort(arr);
        //배열의 모든 수가 양수거나 음수일 때
        if((arr[0]>0)||(arr[arr.length-1]<0)) result=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
        //2개의 수 OR 1개의 수가 음수로 포함된 경우
        else result=arr[0]*arr[arr.length-1]*arr[1];


        return result;
    }
}
