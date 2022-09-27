public class ABCheck {
    public static void main(String[] args) {
        boolean output = ABCheck("a   bcdef");
        System.out.println(output);

    }
    public static boolean ABCheck(String str){
        //a로 시작해서 b로 끝나는 길이 5의 문자열 혹은
        //b로 시작해서 s로 끝나는 길이 5의 문자열 혹은

        String[] arr=str.split("");
        //start index부터 4칸 뒤의 문자열이 맞는지 검사하는 방식
        for (int i=0;i<str.length()-4;i++){
            if (IFAB(str.charAt(i),str.charAt(i+4))) return true;
        }
        return false;

    }
    public static boolean IFAB(char first, char last){
        if(first=='a'||first=='A')
        {
            if(last=='b'||last=='B') return true;
        }
        if(first=='b'||first=='B'){
            if (last=='a'||last=='A') return true;
        }
        return false;
    }

}
