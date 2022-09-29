import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveExtreme {
    //문자열로 구성된 배열을 입력 받아
    //가장 짧은 문자열과
    //가장 긴 문자열의 요소를 가지는 배열을 제거
    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeExtremes(new String[]{"a", "b","c", "c", "tax", "fax"})));

    }

    public static String[] removeExtremes(String[] arr){
        //가장 긴 문자열과 짧은 문자열의 index를 탐색
        int minIndex=0;
        int maxIndex=0;
        for (int i=0;i< arr.length;i++){
            //문자열의 길이 양극단 길이를 탐색
            if(arr[i].length()<=arr[minIndex].length())minIndex=i;
            if(arr[i].length()>=arr[maxIndex].length())maxIndex=i;
        }
        List<String> list=new ArrayList<>();


        for (int i=0;i<arr.length;i++){
            if (i!=maxIndex&&i!=minIndex){

                list.add(arr[i]);

            }


        }
        return list.toArray(new String[0]);

    }
}
