import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class PowerSet {
    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("cba");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]


    }
    public static ArrayList<String> powerSet(String str){

        ArrayList<String> arrayList=new ArrayList<>();
        //원소들을 담을 스텍
        Stack<String> stack=new Stack<>();

        //1. 중복 제거
        String NotDupleStr=duplicated(str);

        //2. 원소를 고르는 과정
        arrayList=pickOrNot(stack,0,NotDupleStr,arrayList);


        //결과 값을 위해 오름차순으로
        Collections.sort(arrayList);


        return arrayList;
    }

    public static String duplicated(String str){
        String result="";
        //중복 판별
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==i){
                result+=str.charAt(i);
            }
        }

        String[] sorted=result.split("");
        Arrays.sort(sorted);

        result=String.join(",",sorted).replaceAll(",","");
        return result;
    }

    public static ArrayList<String> pickOrNot(Stack<String> stack, int idx,String subset,ArrayList<String> result){

        //재귀함수 탈출 조건
        //idx
        if(idx>=subset.length()){
            result.add(stack.toString()
                            .replaceAll("\\[","")
                            .replaceAll(",","")
                            .replaceAll("]","")
                            .replaceAll(" ",""));
            return result;
        } else {
            stack.push(Character.toString(subset.charAt(idx)));
            pickOrNot(stack,idx+1,subset,result);

            //idx가 부분집합에 포함되지 않은 경우
            stack.pop();
            pickOrNot(stack,idx+1,subset,result);

        }
        return result;
    }


}
