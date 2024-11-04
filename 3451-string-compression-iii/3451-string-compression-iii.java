class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = word.length();

        while(i < n) {
            char curChar = word.charAt(i);
            int count = 0;

            // 현재 문자가 최대 9번 연속으로 나타나는 prefix
            while(i < n && word.charAt(i) == curChar && count < 9) {
                i++;
                count++;
            }

            // 길이 + 문자열
            sb.append(count).append(curChar);
        }

        return sb.toString();
    }
}