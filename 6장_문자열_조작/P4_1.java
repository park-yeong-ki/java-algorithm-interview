class P4_1 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for(String b : banned){
            set.add(b.toLowerCase());
        }

        int idx = 0;
        Map<String ,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String word;
        for(int i=0; i<paragraph.length(); i++){
            if(Character.isLetter(paragraph.charAt(i))){
                sb.append(Character.toLowerCase(paragraph.charAt(i)));
            }else{
                word = sb.toString();
                sb.setLength(0);
                if(!word.isEmpty() && !set.contains(word)){
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }
        word = sb.toString();
        sb.setLength(0);
        if(!word.isEmpty() && !set.contains(word)){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String ans = "";
        int max = 0;
        for(String w : map.keySet()){
            if(max < map.get(w)){
                max = map.get(w);
                ans = w;
            }
        }

        return ans;
    }
}