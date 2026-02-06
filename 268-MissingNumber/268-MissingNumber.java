// Last updated: 06/02/2026, 22:45:52
class Solution {
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        for(int i = 0; i < n; i++)
        {
            expectedSum = expectedSum - nums[i];
        }   
        return expectedSum;
    }
}