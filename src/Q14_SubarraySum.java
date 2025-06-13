public class Q14_SubarraySum {
    public static boolean hasSubarrayWithSum(int[] arr, int target) {
        int left = 0, sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left++];
            }

            if (sum == target) {
                System.out.println("Subarray found from index " + left + " to " + right);
                return true;
            }
        }

        System.out.println("No subarray with given sum found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        hasSubarrayWithSum(arr, target);
    }
}
