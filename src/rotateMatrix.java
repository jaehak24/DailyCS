import java.lang.reflect.Array;

public class rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}

        };
        int K = 10;

        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int roatedOne[][]=rotateMatrix(matrix,K);


        System.out.println(roatedOne[0][0]);//->13
        System.out.println(roatedOne[3][2]);//->8

    }

    public static int[][] rotateMatrix(int[][] matrix, int K){
        if(matrix==null||matrix.length==0) return null;
        int[][] arr;
        int n=matrix.length;
        int m=matrix[0].length;
        if(K%4==1||K%4==3){arr=new int[m][n];}
        else {arr=new int[n][m];} //(K%4==2||K%4==0)

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(K%4==1) arr[i][j]=matrix[n-1-j][i];//90도
                else if( K%4==2) arr[i][j]=matrix[n-1-i][m-1-j];//180도
                else if(K%4==3) arr[i][j]=matrix[j][m-1-i]; //270도
                else arr[i][j]=matrix[i][j];
            }
        }
        return arr;

    }


}
