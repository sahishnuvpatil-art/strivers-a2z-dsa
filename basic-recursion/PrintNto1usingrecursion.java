class Solution {
    
      void p(int n){
          if(n==0)return;
          System.out.print(n+" ");
          n--;
          p(n);
      }
    void printNos(int n) {
       
         p(n);
    }
}