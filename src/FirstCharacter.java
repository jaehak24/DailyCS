public class FirstCharacter {
    public static void main(String[] args) {
        System.out.println(firstCharacter("Hello world"));

    }
    public static String firstCharacter(String str) {
        // TODO:
        if(str.length()==0) return "";
        String[] arr=str.split(" ");
        String newString="";

        for(int i=0;i<arr.length;i++){
            newString+=arr[i].charAt(0);
        }
        return newString;
    }
}
