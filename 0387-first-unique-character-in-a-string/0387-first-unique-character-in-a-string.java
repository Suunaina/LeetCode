class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];  //stores the freq of all digits

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // 'l' -'a' = 11 stores it in the 11th index of freq
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
