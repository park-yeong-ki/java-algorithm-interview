class P1_1 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(('0' <= s.charAt(i) && s.charAt(i) <= '9') ||
                    ('a' <= s.charAt(i) && s.charAt(i) <= 'z') ||
                    ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        for(int i=0; i<sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }
}