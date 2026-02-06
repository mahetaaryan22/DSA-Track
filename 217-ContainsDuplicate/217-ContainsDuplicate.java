// Last updated: 06/02/2026, 22:45:55
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (set.contains(x)) {
                return true;   
            }
            set.add(x);
        }
        return false; 
    }
}
