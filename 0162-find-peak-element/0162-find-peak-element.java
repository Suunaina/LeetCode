class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            // note - like other binary search problems , we dont comapre nums[mid] with anything
            // this is only for narrowing the array to a point where left == right , at that point , just return left or right

            if(nums[mid] > nums[mid+1]){
                right = mid;
            }

            if(nums[mid] < nums[mid+1]){
                left = mid + 1;
            }
        }
        return left;
    }
}