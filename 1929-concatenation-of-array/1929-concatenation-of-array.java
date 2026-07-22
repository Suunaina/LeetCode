class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        int i;
        int j;
        for(i=0 ; i<nums.length ; i++)
        {
            ans[i] = nums[i];
        }
        int index = nums.length;
        for(i=0 ; i<nums.length ; i++)
        {
            ans[index] = nums[i];
            index++;
        }
        return ans;
    }
}