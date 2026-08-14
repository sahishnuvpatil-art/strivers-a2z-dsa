// by sahishnu patil 
// on 14 aug 26 at 12:40


class Solution {
    
  int  f(int n){
        if(n==0) return 1;
        return n*f(n-1);
    }
    
    
    
    
    int factorial(int n) {
       
         return f(n);
    }
}
