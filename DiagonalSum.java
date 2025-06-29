public class DiagonalSum {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int pd = 0;
        int sd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    pd += arr[i][j];
                } else if (j == arr.length - 1 - i) {
                    sd += arr[i][j];
                }
            }
        }

        System.out.println(pd+sd);
    }
}