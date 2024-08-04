import java.util.HashSet;
import java.util.Set;
public class checkIfPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        // Add all the characters from a to z in hashset
        for(int i = 'a'; i <= 'z'; i++){
            alphabetSet.add((char) i);
        }

        // remove every character and check
        // if set becomes empty at any point of time
        for(int i = 0; i < sentence.length(); i++){
            alphabetSet.remove(sentence.charAt(i));

            if(alphabetSet.isEmpty()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        checkIfPangram solution = new checkIfPangram();

        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Is pangram: " + solution.checkIfPangram(sentence1));  // Expected output: true

        String sentence2 = "leetcode";
        System.out.println("Is pangram: " + solution.checkIfPangram(sentence2));  // Expected output: false
    }
}
