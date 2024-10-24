class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // 두 노드 null 인 경우 true
        if(root1 == null && root2 == null) {
            return true;
        }

        // 하나는 null 이고 하나는 null이 아닌 경우 또는 값이 다른 경우 false
        if(root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }

        // 두 가지 경우 재귀 호출
        // 1. 자식들이 동일한 순서로 비교되는 경우(왼쪽-왼쪽, 오른쪽-오른쪽)
        boolean withoutFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);

        // 2. 자식들이 좌우가 바뀌어 비교되는 경우 (왼쪽-오른쪽, 오른쪽-왼쪽)
        boolean withFlip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);


        // 둘중 하나 참이면 true
        return withoutFlip || withFlip;
    }
}