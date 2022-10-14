import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class CompressString {
    public static void main(String[] args) {
        String output = compressString("EQTWVO3QVDVRC");
        System.out.println(output); // --> "3wggoppo4p"

    }
    public static String compressString(String str){
        if(str.length()==0) return "";
        StringBuilder sb=new StringBuilder();
        int wordCount=0;
        for (int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1))//1번째 문자와 2번째 문자가 같을 때
            {
                //문자가 계속 일치하면 숫자를 증가
                wordCount++;
                //종점을 만났을 때
                if((i==(str.length()-2))){
                    if(wordCount>=2)
                    {
                        sb.append(wordCount+1);
                        sb.append(str.charAt(i));
                    }
                    else {
                        sb.append(str.charAt(i));
                        sb.append(str.charAt(i));
                    }
                }

            }
            //문자가 일치하지 않는 지점을 만낫을 때 출력
            else{
                //3개 이상의 문자가 같을 때는 wordCount가 2개 이상일 경우
                if (wordCount>=2){
                    sb.append(wordCount+1);
                    sb.append(str.charAt(i));
                    wordCount=0;
                }
                else if(wordCount==1){
                    //중복 문자 2개의 경우
                    sb.append(str.charAt(i));
                    sb.append(str.charAt(i));
                    wordCount=0;
                }
                sb.append(str.charAt(i));
            }

        }
        if(str.charAt(str.length()-1)!=str.charAt(str.length()-2))
            sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}
