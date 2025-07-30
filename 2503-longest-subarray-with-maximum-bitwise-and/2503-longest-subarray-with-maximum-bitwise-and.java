class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,maxlen=0,tem=nums[0],maxlength=0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]==tem&&nums[i]>max){
                max=nums[i];
                tem=nums[i];
              }
              if(nums[i]==max){
                maxlen++;
                if(maxlen>maxlength){
                    maxlength=maxlen;
                }
              }
              else if(nums[i]>max){
                 max=nums[i];
                 tem=nums[i];
                 maxlen=1;
                 maxlength=maxlen;
              }
              else{
                  tem=nums[i];
                  maxlen=0;
              }
        }
        return maxlength;
    }
}