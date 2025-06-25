public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        // calculate left max :

        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];

        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        // calculate right max :

        int rightMax[] = new int[arr.length];
        rightMax[rightMax.length - 1] = arr[arr.length - 1];

        for (int i = rightMax.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i + 1]);
        }

        // calculating the trapped Water :
        int totalTrappedWater = 0;
        for (int i = 0; i < rightMax.length; i++) {
            int currWater = (Math.min(leftMax[i], rightMax[i]) - arr[i]);
            if (currWater < 0) {
                currWater = 0;
            }
            totalTrappedWater += currWater;
        }

        System.out.println(totalTrappedWater);
    }
}
