class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mRow = matrix.length;
        int nCol = matrix[0].length;

        int low = 0;
        int high = mRow * nCol - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = matrix[mid / nCol][mid % nCol];

            if (midValue == target) {
                return true;

            } else if (midValue < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}