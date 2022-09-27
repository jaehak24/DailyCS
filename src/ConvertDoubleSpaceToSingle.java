public class ConvertDoubleSpaceToSingle {
    public static void main(String[] args) {
        String out=convertDoubleSpacetoSingle("I  want to  Love");
        System.out.println(out);

    }

    public static String convertDoubleSpacetoSingle(String str){

        String[] arr=str.split("  ");
        String result="";
        if(arr.length==1)
            return str;
        else {
            result=String.join(" ",arr);
        }
        return result;
    }
}
