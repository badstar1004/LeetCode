class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int maxLength = 0;
        int start = 0, end = 0;
        
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}