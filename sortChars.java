public class sortChars {
    public static void main(String[] args) {
        char str[] = { 'f', 'b', 'a', 'e', 'c', 'd' };
        boolean a = 'b' > 'a';
        System.out.println(a);
        // sort(str);
        // printArr(str);
    }

    public static void sort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; i++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}