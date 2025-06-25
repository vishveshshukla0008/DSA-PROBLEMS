public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }

    public static int search(int[] nums, int target) {
        int pivotIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                pivotIndex = i;
                break;
            }
        }

        if (target == nums[pivotIndex]) {
            return pivotIndex;
        }
        if (target > nums[pivotIndex] && target <= nums[nums.length - 1]) {
            return searchIN(pivotIndex, nums.length - 1, nums, target);
        } else {
            return searchIN(0, pivotIndex - 1, nums, target);
        }
    }

    public static int searchIN(int startIndex, int endIndex, int[] nums, int target) {
        for (int i = startIndex; i <= endIndex; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}