class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findFirst(nums, target);
        int end = findLast(nums, target);

        return new int[] {start, end};
    }

    private int findFirst(int[] nums, int target) {
        int idx = -1;
        int min = 0;
        int max = nums.length - 1;

        while(min <= max) {
            int mid = (min + max) / 2;

            if(nums[mid] >= target) {
                max = mid - 1;

            } else {
                min = mid + 1;
            }

            if(nums[mid] == target) {
                idx = mid;
            }
        }

        return idx;
    }

    private int findLast(int[] nums, int target) {
        int idx = -1;
        int min = 0;
        int max = nums.length - 1;

        while(min <= max) {
            int mid = (min + max) / 2;

            if(nums[mid] <= target) {
                min = mid + 1;

            } else {
                max = mid - 1;
            }

            if(nums[mid] == target) {
                idx = mid;
            }
        }

        return idx;
    }
}