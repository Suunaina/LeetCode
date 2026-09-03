class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=x;
        int rev=0;
        while(y > 0){
            rev = rev*10 + y%10;//1234 0+4 40+3 430+2 4320+1 = 4321
            y=y/10;//1234 123 12 1
        }
        if(rev == x){//4321== 1234
            return true;
        }   
        return false;             
    }
}