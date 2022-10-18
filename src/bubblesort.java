import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bubblesort {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3,5,6,7,4});
        for (int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }

    }
    public static int[] bubbleSort(int[] arr){
        //뒤에서 두 번쨰 수까지 swap
        for(int i=arr.length-1;i>0;i--){
            boolean swap=false;
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int num=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=num;
                    swap=true;
                }

            }
            if(!swap) break;
        }
        return arr;
    }


}
