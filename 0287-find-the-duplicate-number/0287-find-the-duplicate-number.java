class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // // 플로이드의 토끼와 거북이 (Floyd's Tortoise and Hare) 알고리즘
        // // 순환구조의 존재 여부
        // do {
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // } while (slow != fast);

        // // 순환 구조의 시작점
        // slow = nums[0];
        // while(slow != fast) {
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }

        // return slow;

        boolean[] seen = new boolean[nums.length];

        for (int x : nums) {
            if (seen[x]) {
                return x;
            }
            seen[x] = true;
        }

        return -1;
    }
}