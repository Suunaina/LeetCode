class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), ans, new boolean[nums.length]);
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] used) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, curr, ans, used);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}