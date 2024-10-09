class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0, closeCount = 0;
        
        for(char c : s.toCharArray()) {
            // 여는 괄호 일 경우 닫는 괄호가 필요함
            if(c == '(') {
                closeCount++;

            } else if(c == ')') {
                // 닫는 괄호라면 닫는 괄호 사용
                if (closeCount > 0) {
                    closeCount--;

                } else {
                    // 닫는 괄호 추가로 필요
                    openCount++;
                }
            }
        }

        return openCount + closeCount;
    }
}