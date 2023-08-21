package sliding_window;
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 45,6, 10, 19};
        int target = 50;
        System.out.println(findMinSubArray(arr, target));
    }
    private static int findMinSubArray(int[] arr, int target) {
        int n = arr.length;
        int i = 0, j = 0, minLen = Integer.MAX_VALUE;
        int sum = 0;
        while (j < n) {
            sum += arr[j];
            while (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
