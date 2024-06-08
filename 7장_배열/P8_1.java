public class P8_1 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int ans = 0;
        int maxL = height[left];
        int maxR = height[right];
        while(left < right){
            if(maxL <= maxR){
                left++;
                if(maxL < height[left]){
                    maxL = height[left];
                }else{
                    ans += maxL - height[left];
                }
            }else{
                right--;
                if(maxR < height[right]){
                    maxR = height[right];
                }else{
                    ans += maxR - height[right];
                }
            }
        }

        return ans;
    }
}
