
import java.util.*;

public class crypt {

    static String[] words;
    static String result;

    static ArrayList<Character> letters = new ArrayList<>();
    static int[] digit = new int[26];
    static boolean[] used = new boolean[10];

    // Convert a word into its numerical value
    static long getValue(String word) {

        long value = 0;

        for (char ch : word.toCharArray()) {
            value = value * 10 + digit[ch - 'A'];
        }

        return value;
    }

    // Check whether the current assignment satisfies the equation
    static boolean checkSolution() {

        long sum = 0;

        for (String word : words) {
            sum += getValue(word);
        }

        long answer = getValue(result);

        return sum == answer;
    }

    // Backtracking function
    static boolean solve(int position) {

        // All letters have been assigned
        if (position == letters.size()) {
            return checkSolution();
        }

        char ch = letters.get(position);

        for (int d = 0; d <= 9; d++) {

            // Digit already used
            if (used[d]) {
                continue;
            }

            // First letter of a word cannot be zero
            if (d == 0 && isFirstLetter(ch)) {
                continue;
            }

            // Assign digit
            digit[ch - 'A'] = d;
            used[d] = true;

            // Try next letter
            if (solve(position + 1)) {
                return true;
            }

            // Backtrack
            used[d] = false;
            digit[ch - 'A'] = -1;
        }

        return false;
    }

    // Check whether a letter is the first letter of any word
    static boolean isFirstLetter(char ch) {

        for (String word : words) {
            if (word.charAt(0) == ch) {
                return true;
            }
        }

        if (result.charAt(0) == ch) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        words = new String[n];

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next().toUpperCase();
        }

        System.out.print("Enter result word: ");
        result = sc.next().toUpperCase();

        // Find all unique letters
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (!letters.contains(ch)) {
                    letters.add(ch);
                }
            }
        }

        for (char ch : result.toCharArray()) {
            if (!letters.contains(ch)) {
                letters.add(ch);
            }
        }

        // More than 10 unique letters is impossible
        if (letters.size() > 10) {
            System.out.println("No solution possible.");
            return;
        }

        // Initialize digits
        Arrays.fill(digit, -1);

        // Solve
        if (solve(0)) {

            System.out.println("\nSolution:");

            for (char ch : letters) {
                System.out.println(ch + " = " + digit[ch - 'A']);
            }

            System.out.println("\nEquation:");

            for (String word : words) {
                System.out.print(getValue(word) + " + ");
            }

            System.out.println("\b\b= " + getValue(result));

        } else {
            System.out.println("No solution found.");
        }

        sc.close();
    }
}
