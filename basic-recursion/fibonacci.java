//on 25-08-2026 at 8:21 am



class Solution {

    
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}