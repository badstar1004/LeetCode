class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int len = piles.length;
        int start = 1;
        int end = piles[len-1];

        while(start < end){
            int speed = (start+end) / 2;  // 중간 스피드부터 시작
            int time = 0;
            for (int i = 0; i < len; i++) {
                time += Math.ceil((double)piles[i]/speed);
                if(time > h){ //다 못먹었는데 시간 초과됨, 속도를 올려야함
                    start = speed+1;
                    break;
                }
            }
            if(time <= h){  //시간안에 다 먹었으면 속도를 줄여서 다시 확인
                end = speed;
            }
        }
        return start;
    }
}