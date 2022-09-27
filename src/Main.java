import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }

    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if(arr.length==0) return null;
        HashMap<String,String> HM=new HashMap<String,String>();
        HM.put(arr[0],arr[arr.length-1]);//값 추가

        return HM;
    }
}
