class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);

        int lastNum = nums[nums.length - 1];
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += (lastNum + i);
            i++;
        }
        // for(int i = 0; i < k; i++) {
        //     sum += (lastNum + i);
        // }

        return sum;
    }
}