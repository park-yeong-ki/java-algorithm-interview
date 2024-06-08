class P9_1 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<nums.length; i++){
            int target = nums[i] * -1;
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] < target){
                    left++;
                }else if(nums[left] + nums[right] > target){
                    right--;
                }else{
                    sb.append(nums[i]).append(nums[left]).append(nums[right]);
                    if(!set.contains(sb.toString())){
                        ans.add(List.of(nums[i], nums[left], nums[right]));
                        set.add(sb.toString());
                    }
                    sb.setLength(0);

                    left++;
                    right--;
                }
            }
        }

        return ans;
    }
}