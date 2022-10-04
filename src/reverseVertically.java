import java.util.Arrays;

public class reverseVertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
                "abc",
                "clea"
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"
    }
    public static String readVertically(String[] arr){
        String result="";
        int maxLengthOfArr= arr[0].length();// 가장 길이가 긴
        for (int i=0;i<arr.length;i++){
            if (maxLengthOfArr<=arr[i].length())maxLengthOfArr=arr[i].length();
        }


        for (int i=0;i<maxLengthOfArr;i++){
            for (int j=0;j<arr.length;j++){

                if(arr[j].length()<=i) {continue;}
                else {result+=arr[j].charAt(i);}
            }
        }

        return result;



    }
}
