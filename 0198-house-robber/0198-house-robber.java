class Solution {
    public int rob(int[] nums) {
        int cur = 0; 
        int prev =0;
        for (int num :nums){
           int temp = cur;
           cur = Math.max(cur, prev+num);
           prev = temp;
        } 
        return cur
            }
}