public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] answer = new int[n];

        // Prefix product
        answer[0] = 1;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Suffix product
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }

        // Print result
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
