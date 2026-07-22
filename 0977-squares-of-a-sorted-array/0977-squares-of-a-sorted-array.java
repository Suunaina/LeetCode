// Works only when the given array is already sorted
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        int[] ans = new int[nums.length];

        while (i <= j) {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];

            if (left > right) {
                ans[k--] = left; // Decrement k after placing the larger square
                i++;
            } else {
                ans[k--] = right;
                j--;
            }
        }
        return ans;
    }
}


// Brute Force Solution
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         // Square each element
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }

//         // Bubble Sort
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length - i - 1; j++) {
//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j + 1];
//                     nums[j + 1] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }

//         return nums;
//     }
// }