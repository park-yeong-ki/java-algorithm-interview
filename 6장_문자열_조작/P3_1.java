class P3_1 {
    public String[] reorderLogFiles(String[] logs) {
        List<String> sList = new ArrayList<>();
        List<String> nList = new ArrayList<>();

        for(String log : logs){
            if(Character.isDigit(log.charAt(log.length()-1))){
                nList.add(log);
            }else{
                sList.add(log);
            }
        }

        Collections.sort(sList, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String[] arr1 = s1.split(" ", 2);
                String[] arr2 = s2.split(" ", 2);
                if(arr1[1].compareTo(arr2[1]) == 0){
                    return arr1[0].compareTo(arr2[0]);
                }
                return arr1[1].compareTo(arr2[1]);
            }
        });
        sList.addAll(nList);

        return sList.toArray(new String[0]);
    }
}