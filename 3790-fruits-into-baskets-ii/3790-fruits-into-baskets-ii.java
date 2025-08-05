class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplace =0;
        for(int i=0;i<fruits.length;i++){
            boolean check=true;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=-1;
                    check=false;
                    break;
                }
            }
            if(check){
                unplace++;
            }
        }
        return unplace;
    }
}