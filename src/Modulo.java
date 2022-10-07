public class Modulo {
    public static void main(String[] args) {
        Integer output=modulo(100,3);
        System.out.println(output);
    }

    public static Integer modulo(int num1, int num2){
        if(num2==0)return null;
        Integer leftover=num1;

        while(leftover>=num2){
            leftover-=num2;
        }
        return leftover;

    }
}
