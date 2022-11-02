public class CircleArraysearch {
    public static void main(String[] args) {
        int output=Solution(new int[]{9,10,15,4,6,8},6);
        System.out.println(output);//->5

    }
    public static int Solution(int[] rotated,int target ){

        //이진 탐색 트리
        //왼쪽의 첫째값과 오른쪽의 마지막 값을 지정
        int mid;
        int left=0;
        int right=rotated.length-1;

        //배열의 사이즈가 1이 될 떄까지 반복
        while (left<=right){
            mid=(right+left)/2;

            if(rotated[mid]==target) return mid;

            //부분적으로 오름차순으로 정렬 되어 잇으므로
            //어느쪽이 큰 숫자들이 몰려있는지 파악할 필요가 있음
            if(rotated[right]>rotated[mid]){
                //오른쪽 값이 정렬된 상태 ex> {6,0,1,2,3,4,5}
                if(target>rotated[mid]&&rotated[right]>=target) {
                    left=mid+1;}
                else right=mid-1;
            }
            else {
                if (target<rotated[mid]&&rotated[left]<=target){
                    right=mid-1;
                }
                else left=mid+1;
            }

        }


        //target 값이 없는 경우
        return -1;

    }
}
