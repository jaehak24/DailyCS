public class RBPath {
    public static void main(String[] args) {
        //1은 장애물
        //0이동이 가능한 통로
        int[][] room = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int[] src = new int[]{4, 2};
        int[] dst = new int[]{2, 2};
        int output = rbPath(room, src, dst);
        System.out.println(output); // --> 8

    }
    public static int rbPath(int[][] room, int[]src, int[] dst){

    }
}
