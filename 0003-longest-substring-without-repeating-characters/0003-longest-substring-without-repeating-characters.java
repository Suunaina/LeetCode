class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen = new int[128];
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            seen[s.charAt(right)]++;

            while (seen[s.charAt(right)] > 1) {
                seen[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}