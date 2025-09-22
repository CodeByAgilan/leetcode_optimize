class Solution {
    public int maxFrequencyElements(int[] nums) {
        int size=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>size){
                size=i;
            }
        }
        int arr[]=new int [++size];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int g=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==g){
                max+=arr[i];
            }
            if(arr[i]>g){
                g=arr[i];
                max=arr[i];
            }
        }
        return max;
    }
}