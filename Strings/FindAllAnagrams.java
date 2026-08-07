import java.util.*;

public class FindAllAnagrams {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            System.out.println(result);
            return;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of characters in p
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {

            // Add current character
            windowFreq[s.charAt(i) - 'a']++;

            // Remove character outside the window
            if (i >= windowSize) {
                windowFreq[s.charAt(i - windowSize) - 'a']--;
            }

            // Check whether current window is an anagram
            if (i >= windowSize - 1 &&
                    Arrays.equals(pFreq, windowFreq)) {

                result.add(i - windowSize + 1);
            }
        }

        System.out.println(result);
    }
}
