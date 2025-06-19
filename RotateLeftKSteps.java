public class RotateLeftKSteps {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int k = 2;
        rotateArr(arr, k);
    }

    public static void rotateArr(int arr[], int d) {
        int[] tempArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = (i - d) % arr.length;
            if (index < 0)
                index = arr.length + index;
            tempArr[index] = arr[i];
        }

        for (int i = 0; i < tempArr.length; i++) {
            System.out.println(tempArr[i] + " ");
        }

    }
}
