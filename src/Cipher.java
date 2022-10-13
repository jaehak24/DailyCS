public class Cipher {
    public static void main(String[] args) {
       String output = Cipher("khoor zruog", 3);
        System.out.println(output); // --> world

    }

    public static String Cipher(String str, int secret){
        //'hello'<-3-'khoor'
        if(str.length()==0)return "";




        String result="";
        for (int i=0;i<str.length();i++){
            //공백 문자 처리
            if(str.charAt(i)==32){
                result+=str.charAt(i);
            }
            //두 문자를 뺀 값이 소문자 범위를 넘어갓을 경우
            else if((int)str.charAt(i)-secret<'a'){

                int num='z'-(secret-(str.charAt(i)-'a'))+1;

                //문자로 형변환 후 result 문자열에 추가
                result+=(char)num;

            }
            else{
                int num=str.charAt(i)-secret;
                //문자로 형변환 후 result 문자열에 추가
                result+=(char)num;

            }

        }
        return result;
    }
}
