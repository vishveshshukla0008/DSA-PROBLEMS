public class searchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        System.out.println(search(arr, 4,4,88));
    }

    public static boolean search(int[][] arr, int n, int m, int target) {
        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (arr[i][j] == target) {
                System.out.println("Key founded at index (" + i + ", " + j + ")");
                return true;
            } else if (target > arr[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}