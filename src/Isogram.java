import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Isogram {
    public static void main(String[] args) {
        boolean output = IsIsogram("dropOut");
        System.out.println(output); // false

    }
    public static boolean IsIsogram(String str){
        //빈 문자열 체크
        if (str==null) return true;
        //문자열을 받기 위한 새로운 리스트 생성
        List<Character> list= new ArrayList<>();

        //문자열에 값을 넣기 전 str을 대문자로 변환
        str=str.toUpperCase();
        //문자열 값을 리스트로 이동
        for (int i=0;i<str.length();i++){

            list.add(str.charAt(i));
        }

        // stream으로 변환 후 distinct 메소드를 사용해서 얻은 count 값과 str의 길이가 다르면 false 맞으면 true
        if(list.stream().distinct().count()==str.length()) {
            return true;
        }
        else return false;


    }


}
