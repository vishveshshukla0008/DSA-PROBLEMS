public class PrintSubArray {
    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4, -5 };
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(maxSum);
    }
}