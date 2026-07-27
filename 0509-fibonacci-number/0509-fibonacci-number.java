class Solution {
    public int fib(int n) {
        //int res = 0;
        if(n <= 1)
            return n;

        else if(n > 1)
            return fib(n-1) + fib(n-2);
        
        return 0;
    }
}