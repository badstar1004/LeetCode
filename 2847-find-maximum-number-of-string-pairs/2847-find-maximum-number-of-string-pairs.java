import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Set<String> setWords = new HashSet<>();

        for(String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();

            if(setWords.contains(reverseWord)) {
                count++;
                setWords.remove(reverseWord);

            } else {
                setWords.add(word);
            }
        }

        return count;
    }
}