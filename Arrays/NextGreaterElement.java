import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] nums = {4, 5, 2, 10, 8};
        int[] result = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(nums[i]);
        }

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
