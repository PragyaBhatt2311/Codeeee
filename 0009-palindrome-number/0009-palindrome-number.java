class Solution {
    public boolean isPalindrome(int x) {
        int orx=x;
        int ld;
        int sum=0;
        while(x>0){
            ld=x%10;
            sum=sum*10+ld;
            x=x/10;
        }
        if(orx==sum){
            return true;
        }
        else{
            return false;
        }
    }
}