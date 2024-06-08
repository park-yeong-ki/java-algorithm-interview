class P11_1 {
    public int[] productExceptSelf(int[] nums) {
        int[] adp = new int[nums.length];
        adp[0] = 1;
        for(int i=1; i<nums.length; i++){
            adp[i] = adp[i-1] * nums[i-1];
        }

        int[] bdp = new int[nums.length];
        bdp[nums.length - 1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            bdp[i] = bdp[i+1] * nums[i+1];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = adp[i] * bdp[i];
        }

        return ans;
    }
}