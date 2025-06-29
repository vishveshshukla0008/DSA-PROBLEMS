public class twoDArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 }
        };

        spiralMatrix(arr, 4, 5);

    }

    public static void spiralMatrix(int[][] arr, int n, int m) {
        int srow = 0, erow = n - 1, scol = 0, ecol = m - 1;

        while (srow <= erow && scol <= ecol) {
            // TOP : (Every time changing the column and row will common :)

            for (int j = scol; j <= ecol; j++) {
                System.out.print(arr[srow][j]);
            }

            // RIGHT : (Every time changing the row and col will common :)

            for (int i = srow + 1; i <= erow; i++) {
                System.out.print(arr[i][ecol]);
            }

            // Bottom : (Every time changing the column and row will same and traversing in
            // reverse fashion :);

            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow) {
                    break;
                }
                System.out.print(arr[erow][j]);
            }

            // Left : (Every time changing the row and col will same and traversing from
            // bottom to top :)

            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) {
                    break;
                }
                System.out.print(arr[i][scol]);
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }
    }
}