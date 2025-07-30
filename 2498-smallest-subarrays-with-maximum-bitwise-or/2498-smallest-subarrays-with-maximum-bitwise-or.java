class Solution {
    public int[] smallestSubarrays(int[] nums) {
        // int size=arr.length;
        //  int maxlengtharray[]=new int[size];
	    //   for(int i=0;i<size;i++) {
	    // 	  int maxsize=1;
	    // 	  int max=arr[i];
	    // 	  int tempcnt=arr[i];
	    // 	  for(int j=i+1;j<size;j++){
        //           	tempcnt|=arr[j];
        //           	if(tempcnt>max) {
        //           		maxsize=(j-i+1);
        //           		max=tempcnt;
        //           	}
	    // 	  }
	    // 	  maxlengtharray[i]=maxsize;
	    //   }
        //   return  maxlengtharray;
        int n = nums.length;
        int[] pos = new int[31];
        Arrays.fill(pos, -1);
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            int j = i;
            for (int bit = 0; bit < 31; ++bit) {
                if ((nums[i] & (1 << bit)) == 0) {
                    if (pos[bit] != -1) {
                        j = Math.max(j, pos[bit]);
                    }
                } else {
                    pos[bit] = i;
                }
            }
            ans[i] = j - i + 1;
        }
        return ans;
    }
}