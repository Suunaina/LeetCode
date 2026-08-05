class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }
    
    void backtrack(int[] nums, int start, List<Integer> curr) {
        ans.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}