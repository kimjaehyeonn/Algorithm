import java.util.*;
class Solution {
    public int rob(int[] nums) {
        int curr = 0;
        int prev = 0;
        for (int num : nums) {
            int temp = curr;
            curr  = Math.max(temp, prev + num );
            prev = temp;
        }
        return curr;
    }
}