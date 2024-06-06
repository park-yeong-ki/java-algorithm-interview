class P6_1 {
    int len;
    String str, ans;
    public String longestPalindrome(String s) {
        len = s.length();
        str = s;
        ans = String.valueOf(s.charAt(0));
        for(int i=0; i<s.length(); i++){
            LPS(i-1, i+1);
            LPS(i, i+1);
        }

        return ans;
    }

    public void LPS(int left, int right){
        if(left < 0 || right >= len) return;
        if(str.charAt(left) != str.charAt(right)) return;
        if(ans.length() < right - left + 1){
            ans = str.substring(left, right + 1);
        }

        LPS(left-1, right+1);
    }
}