class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;

        HashMap<Integer, Integer> countMap = new HashMap<>();
    
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int count : countMap.values()) {
            pairs += count * (count - 1) / 2;
        }

        return pairs;
    }
}