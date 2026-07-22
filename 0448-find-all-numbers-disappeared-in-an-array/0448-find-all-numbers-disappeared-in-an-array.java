class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            int index = Math.abs(nums[i]) - 1;    // index = abs(4) - 1 to convert the array into negative
            nums[index] = -Math.abs(nums[index]);  // nums[4] = -7 if there are two occurances of the same number , then the number becomes positive again , this lines keeps the number in that index negative 
        }

        for(int i=0 ; i<n ; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}