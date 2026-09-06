class main{
    public int Longestsubarray(int [] nums, int k){
        int sum=0;
        int left=0;
        int maxlen=0;
        for (int right=0; right<nums.length; right++){
            sum+=nums[right];
            while (sum>k){
                sum-=nums[left];
                left++;
            }
            if (sum==k){
                    maxlen=Math.max(maxlen, right-left+1);
            }
        }
        return maxlen;
        
    }
}