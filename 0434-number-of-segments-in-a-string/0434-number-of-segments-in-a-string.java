class Solution {
    public int countSegments(String s) {
        String trimString = s.trim();

        if(trimString.isEmpty()) {
            return 0;
        }

        String[] arrSplit = trimString.split("\\s+");
        return arrSplit.length;
    }
}