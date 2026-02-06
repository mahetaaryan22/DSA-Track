// Last updated: 06/02/2026, 22:45:54
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int n = nums.length;
        if (n == 0) return res;

        int start = nums[0];
        int prev = nums[0];

        for (int i = 1; i < n; i++) {
            // break in continuity
            if (nums[i] != prev + 1) {
                addRange(res, start, prev);
                start = nums[i];
            }
            prev = nums[i];
        }

        // add last range
        addRange(res, start, prev);
        return res;
    }

    // helper to format range
    private void addRange(List<String> res, int start, int end) {
        if (start == end) {
            res.add(String.valueOf(start));
        } else {
            res.add(start + "->" + end);
        }
    }
}
