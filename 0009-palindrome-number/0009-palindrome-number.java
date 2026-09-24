class Solution {
    public boolean isPalindrome(int x) {

        //to check negatives and if number is not 0 but ends with 0
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        //if number ends with 0 -> 120, pal will be 021 which is considered as 21 so it can never be pal

        int rev = 0;

        while (x > rev) //to reverse only half of it and check if both halves match
        {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        // for odd number of digits, 121 -> 12 -- 1; so it will be wrong, so we do 1 == 12/10 ; 1 == 1
        return x == rev || x == rev / 10; 
    }
}