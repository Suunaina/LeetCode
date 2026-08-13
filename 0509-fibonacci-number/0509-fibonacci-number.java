// class Solution {
//     public int fib(int n) {
//         //int res = 0;
//         if(n <= 1)
//             return n;

//         else if(n > 1)
//             return fib(n-1) + fib(n-2);
        
//         return 0;
//     }
// }

class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}