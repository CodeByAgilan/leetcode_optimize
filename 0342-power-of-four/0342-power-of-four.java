class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if((n&n-1)==0){
            if(n%10==4||n%10==6){
                return true;
            }
        }
        return false;
    }
}