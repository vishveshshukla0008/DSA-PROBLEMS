public class Learn {
    public static void main(String[] args) {
        int arr[]  = {5,4,10,1,2};
        countingSort(arr);
        // printArr(arr);
    }

    public static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(max);
        System.out.println(min);

        int[] freqArr = new int[100000];
        for (int i : arr) {
            freqArr[i]++;
        }

        for (int i = min, j = 0; i <= max; i++) {
            while (freqArr[i] > 0) {
                arr[j++] = i;
                freqArr[i]--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}