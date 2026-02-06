// Last updated: 06/02/2026, 22:45:57
class Solution {
    public int singleNumber(int[] nums) 
    {
        int ans = 0;

        for(int x : nums)
        {
            ans = ans ^ x;
        }
        return ans;
    }
}