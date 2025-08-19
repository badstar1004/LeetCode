import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> resultMap = new HashMap<>();
        for(int num : nums1) {
            resultMap.put(num, resultMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for(int num : nums2) {
            if(resultMap.containsKey(num) && resultMap.get(num) > 0) {
                resultList.add(num);
                resultMap.put(num, resultMap.get(num) - 1);
            }
        }

        return resultList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}