public class numberSearch {
    public static void main(String[] args) {
        int output = Solve("Hello6 9World 2,");
        System.out.println(output); // --> 2
        output = Solve("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    //문자열에서 숫자를 추출하는 방법
    public static int Solve(String str){
        if(str.length()==0)return 0;
        double sumOfNumber=0.0;
        int len=str.length();
        //문자열을 돌보고 해당 문자열에서 숫자들의 합을 구함
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //아스키 코드 값
            if(48<=ch&&ch<=57){
                sumOfNumber+=ch-48;
                //숫자를 발견하면 문자열 길이값 감소
                len--;
            }
            if(ch==32) len--;
        }


        sumOfNumber=Math.round(sumOfNumber/len);


        return (int)sumOfNumber;
    }
}
