class Solution {
    static boolean armstrongNumber(int n) {
        if(n<11)return false;   //a numner  smaller thaan zero cant be a armstrong number 
        
        int arm=0; int temp=n;
        while(temp>0){
         int ld=temp%10;    //last digit 
         int s=ld*ld*ld;   // cube of last digit
         arm+=s;          
         temp/=10;
         
        }
        if(arm==n)return true;
        else return false;
        
    }
}