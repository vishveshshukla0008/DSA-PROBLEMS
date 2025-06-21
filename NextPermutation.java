public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = { 1,3,2 };

        // Approach :
        // 1. Find the pivot point :
        // 2. Check if pivot == -1 the re-arrange the values (reverse the for minimum
        // value :)
        // 3. Find the just bigger element from pivot + 1 to n: and swap it :
        // 4. Reverse the rest number after the pivot index till arr.length

        // Okay Lets get started

        // 1. Finding the pivot index :

        int pivotIndex = findPivotPoint(arr);

        // 2. Check if pivot == -1 the re-arrange the values (reverse the for minimum
        // value :)

        if (pivotIndex == -1) {
            int i = 0, j = arr.length - 1;
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } else {

            // 3. Find the just bigger element from pivot + 1 to n: and swap it :

            for (int i = arr.length - 1; i > pivotIndex; i--) {
                if (arr[i] > arr[pivotIndex]) {
                    swap(arr, i, pivotIndex);
                    break;
                }
            }

            // 4. Now we have to do only reverse the rest values in the array :

            int i = pivotIndex + 1;
            int j = arr.length - 1;
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Printing the array :

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void swap(int arr[], int i, int pivot) {
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
    }

    public static int findPivotPoint(int[] nums) {
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}