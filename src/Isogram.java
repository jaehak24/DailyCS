import java.util.Arrays;
import java.util.List;

public class Isogram {
    public static void main(String[] args) {
        boolean output = IsIsogram("aba");
        System.out.println(output); // false

    }
    public static boolean IsIsogram(String str){
        if (str==null) return true;
        List<Character> list= Arrays.asList();
        for (int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        if(list.stream().distinct().count()==str.length())
            return true;
        else return false;


    }


}
