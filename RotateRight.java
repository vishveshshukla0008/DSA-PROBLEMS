public class RotateRight {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int key = 3;

        // calling a function

        rotate(arr, key);

    }

    // Create a function here to achieve the rotation :
    public static void rotate(int[] nums, int k) {

        // creating a new temp array :

        int[] temp = new int[nums.length];

        // shifting every element to the right from original place
        for (int i = 0; i < temp.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        // basically % plays a crucial role in this :
        // % places also at the index 0 when it reaches at length and this the amazing
        // learning from this :

        // after rotation i place all temp array elements in original nums array ✌️

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

}