class P5_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        char[] cArr;
        String anagram;
        for(String str : strs){
            cArr = str.toCharArray();
            Arrays.sort(cArr);
            anagram = String.valueOf(cArr);
            if(!map.containsKey(anagram)){
                map.put(anagram, new ArrayList<>());
            }
            map.get(anagram).add(str);
        }

        return new ArrayList<>(map.values());
    }
}