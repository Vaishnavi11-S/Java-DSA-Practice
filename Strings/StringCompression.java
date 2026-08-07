public class StringCompression {

    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int write = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // Store character
            chars[write++] = current;

            // Store count if greater than 1
            if (count > 1) {
                String number = String.valueOf(count);

                for (char ch : number.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }

        // Print compressed array
        for (int j = 0; j < write; j++) {
            System.out.print(chars[j] + " ");
        }
    }
}
