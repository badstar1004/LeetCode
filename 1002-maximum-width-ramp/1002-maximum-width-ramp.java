class Solution {
    public int maxWidthRamp(int[] nums) {
        // Stack 사용
        Stack<Integer> stack = new Stack<>();

        // 인덱스 넣음 ➡️ nums[i] 보다 작은것만
        for(int i = 0; i < nums.length; i++) {
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        // 길이가 큰 인덱스를 찾음
        int max = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            // 스택에 있는 인덱스 값이 nums[i] 보다 작은 경우
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                max = Math.max(max, i - stack.pop());
            }
        }

        return max;

    }
}