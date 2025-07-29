package isPanagram;

import java.util.HashSet;
import java.util.Set;

public class IsPanagram {
    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // Write your code here
        if(s==null || s.equals(""))
            return "not panagram";
        Set<Character> alphabetSet = new HashSet<>();
        // Convert the input text to lowercase to handle case-insensitivity
        String lowerCaseText = s.toLowerCase();

        for (char c : lowerCaseText.toCharArray()) {
            // Check if the character is a lowercase English alphabet letter
            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }

        // A string is a pangram if the set contains all 26 letters
        if(alphabetSet.size() == 26)
            return "pangram";
        else return "not panagram";
    }
}
