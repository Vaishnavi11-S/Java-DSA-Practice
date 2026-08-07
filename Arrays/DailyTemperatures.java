import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] answer = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int previousDay = stack.pop();

                answer[previousDay] = i - previousDay;
            }

            stack.push(i);
        }

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}
