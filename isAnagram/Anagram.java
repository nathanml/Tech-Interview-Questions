package isAnagram;

import java.util.*;

public class Anagram {

    /*
        Checks if 2 strings are anagrams
        O(nlogn) where n is word length to sort
     */
    public boolean isAnagram(String s1, String s2)
    {
        if(Objects.isNull(s1) && Objects.isNull(s2))
            return true;
        if((Objects.isNull(s1) && Objects.nonNull(s2)) ||
                (Objects.nonNull(s1) && Objects.isNull(s2)) || s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0; i<c1.length; i++)
        {
            if(c1[i] != c2[i])
                return false;
        }
        return true;
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public ArrayList<String> getAnagrams(ArrayList<String> words)
    {
        ArrayList<String> response = new ArrayList();
        HashMap<String, List<String>> map = new HashMap<>();
        //Add all sorted words to hash map
        for(String word: words)
            //If soreted word already in hash map, add to anagrams list
            map.computeIfAbsent(sortString(word), k -> new ArrayList<>()).add(word);

        //Iterate through map
        for(List<String> anagrams : map.values())
            //If sorted word has multiple anagrams
            if(anagrams.size() > 1)
                //Add all anagrams to response
                response.addAll(anagrams);
        return response;
    }

    public static void main(String[] args)
    {

    }
}
