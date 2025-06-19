public class MoveAllZeroesToRight {
    public static void main(String[] args) {
        int arr[] = { 0,1,0,3,12 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println(arr[arr.length-2]);
    }
}
