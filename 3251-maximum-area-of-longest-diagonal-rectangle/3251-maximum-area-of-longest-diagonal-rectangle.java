class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int  pro=0;
        int diasqr=0;
        for(int i=0;i<dimensions.length;i++){
            int temp=(int)(Math.pow(dimensions[i][0],2)+Math.pow(dimensions[i][1],2));
            if(temp>diasqr){
                diasqr=temp;
                pro=dimensions[i][0]*dimensions[i][1];
            }
            else if(temp==diasqr){
                pro=Math.max(pro,(dimensions[i][0]*dimensions[i][1]));
            }
        }
        return pro;
    }
}