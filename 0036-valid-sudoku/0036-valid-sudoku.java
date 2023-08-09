class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        // 각 규칙의 배열 선언
        boolean[][] chkRow = new boolean[N][N];
        boolean[][] chkCol = new boolean[N][N];
        boolean[][] chkTree = new boolean[N][N];

        // for문
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                char targetC = board[i][j];

                if(targetC != '.') {
                    // 인덱스로 변환
                    int idx = targetC - '1';

                    // 행, 열, 3x3 중복 체크
                    if(chkRow[i][idx] || chkCol[j][idx] || chkTree[(i / 3) * 3 + j / 3][idx]) {
                        return false;
                    }

                    // 중복이 아니면 true
                    chkRow[i][idx] = true;
                    chkCol[j][idx] = true;
                    chkTree[(i / 3) * 3 + j / 3][idx] = true;
                }
            }
        }

        return true;
    }
}