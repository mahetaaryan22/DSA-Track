// Last updated: 06/02/2026, 22:45:56
class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int count = 0;
        int element = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(count == 0)
            {
                element = nums[i];
            }

            if(nums[i] == element)
            {
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}