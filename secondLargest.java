public class secondLargest {

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 11 };
        System.out.println(secondLargestNumber(arr));
    }

    public static int secondLargestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sl = -1;
        for (int i : arr) {
            if (i > max) {
                sl = max;
                max = i;
            } else if (i < max && i > sl) {
                sl = i;
            }
        }
        if (sl == Integer.MIN_VALUE) {
            return -1;
        }
        return sl;
    }
}