import java.util.HashSet;
import java.util.Set;
public class checkIfPangram {
    public boolean checkIfPangram(String sentence) {
        // Create a Set to store unique letters
        Set<Character> uniqueLetters = new HashSet<>();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Add the character to the Set if it's a letter
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }

        // Check if the Set contains 26 unique letters
        return uniqueLetters.size() == 26;
    }

    public static void main(String[] args) {
        checkIfPangram solution = new checkIfPangram();

        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Is pangram: " + solution.checkIfPangram(sentence1));  // Expected output: true

        String sentence2 = "leetcode";
        System.out.println("Is pangram: " + solution.checkIfPangram(sentence2));  // Expected output: false
    }
}
