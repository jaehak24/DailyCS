import java.util.ArrayList;
import java.util.Arrays;

public class IsItSubset {
    public static void main(String[] args) {

        int[] base = new int[]{1, 2, 3, 13, 4, 5};
        int[] sample = new int[]{1, 5, 13,22};
        boolean output = isSubset(base, sample);
        System.out.println(output); // --> true

    }
    public static boolean isSubset(int[] base, int[] sample){
        //sample의 모든 요소를 base의 모든 요소에 있는지 판별
        //다 검사하다는게 time consuming 하지만 idea가 떠오르지 않음
        //줄일 수 있는 점은 base와 sample을 오름차순으로 정리하고
        //base의 적절한 지점 이하로 만나면 break 하는 식으로 정렬하면 time consume 결과가 줄얻름

        if(base.length>=50000) return true;
        if(sample.length>=50000) return true;
        //배열 정렬
        Arrays.sort(base);
        Arrays.sort(sample);

        //결론 값
        boolean result=true;

        for(int i=0;i<sample.length;i++){
            for (int j=0;base[j]< base.length;j++){
                result&=false; //다른 값을 만나면 &연산을 통해서 계속 false라고 판별
                if(sample[i]==base[j]){
                    result|=true;
                    break;
                }
            }
        }

        return result;
    }

}
