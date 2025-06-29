public class sumOfSecondRow {
    public static void main(String[] args) {
        int arr[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the second row is " + sum);
    }
}
