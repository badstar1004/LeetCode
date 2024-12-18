class Solution {
    public int[] finalPrices(int[] prices) {
        // 크기
        int n = prices.length;
        int[] result = new int[n];

        // for문으로 차이를 구함
        for(int i = 0; i < n; i++) {
            result[i] = prices[i];

            for(int j = i + 1; j < n; j++) {
                if(prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return result;
    }
}