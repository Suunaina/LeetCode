class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) { // is left half sorted                             

                if (target >= nums[left] && target < nums[mid]) { // if target is in left half , search left
                    right = mid - 1;
                }

                else { // search right
                    left = mid + 1;
                }
            }

            else { // is right half sorted
                if (target > nums[mid] && target <= nums[right]) { // if targe in right half , search right
                    left = mid + 1;
                }

                else {
                    right = mid - 1; // search left
                }
            }
        }
        return -1;
    }
}