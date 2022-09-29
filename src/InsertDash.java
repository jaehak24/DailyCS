public class InsertDash {
    public static void main(String[] args) {
        String ouput=InsertDash("454793");
        System.out.println(ouput);
    }
    public static String InsertDash(String str){
        //연속 홀수형 판별
        if(str.length()==0) return null;
        String result="";
        for (int i=0;i<str.length()-1;i++){
            if ((str.charAt(i)-'0')%2==1&&(str.charAt(i+1)-'0')%2==1){
                result+=str.charAt(i)+"-";
            }
            else result+=str.charAt(i);
        }
        result+=str.charAt(str.length()-1);

        return result;

    }

}
