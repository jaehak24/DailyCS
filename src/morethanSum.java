public class morethanSum {
    public static void main(String[] args) {
        boolean output = moreThanSum(new int[]{-2247, 1039, 1064});
        System.out.println(output); // --> true

    }
    public static boolean moreThanSum(int[] arr){
        int sum=0;
        if(arr.length==2)
        {if(arr[1]<=arr[0]) return false;}
        else {
            for (int i=0;i<arr.length-1;i++){
                sum+=arr[i];
                if (sum>=arr[i+1]) return false;

            }
        }
        return true;
    }
}
