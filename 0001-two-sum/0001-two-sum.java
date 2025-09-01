class Solution {
    public int[] twoSum(int[] t, int ta) {
        int arr[]=new int [2];//0,1// 0,0
        for(int i=0;i<t.length;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i]+t[j]==ta){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}