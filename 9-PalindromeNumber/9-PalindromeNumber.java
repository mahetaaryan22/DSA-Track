// Last updated: 06/02/2026, 22:46:04
class Solution {
    public boolean isPalindrome(int x) 
    {
        int original = x;
        int rev = 0;

        while(x>0)
        {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }    
        return rev == original;
    }
}