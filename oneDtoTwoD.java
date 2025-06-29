public class oneDtoTwoD {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4 };
        int n = 2;
        int m = 2;
        convert(original, n, m);
    }

    static void convert(int[] original, int n, int m) {
        // create a 2D array :
        int arr[][] = new int[n][m];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = original[index++];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}