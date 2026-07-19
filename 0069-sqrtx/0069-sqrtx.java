class Solution {
    public int mySqrt(int x) {
        //return (int)Math.sqrt(x);

        int left = 1;
        int right = x;
        
        while(left <= right){
            int mid = left + (right - left) / 2;

            if((long)mid * mid == x){
                return mid;
            }

            else if((long)mid * mid < x){
                left = mid + 1; 
            }

            else{
                right = mid - 1;
            }
        }
        return right;//gives the largest valiid number when x is not a perfect square
    }
}