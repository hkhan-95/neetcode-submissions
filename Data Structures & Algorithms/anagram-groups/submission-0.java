class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();
        List<List<String>> returnList = new ArrayList<>();
        if (strs.length < 1){
            return returnList;
        }

        //add elements to the hm
        for (String i : strs){
            char[] charArr = i.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if (!groupMap.containsKey(sorted)){
                groupMap.put(sorted, new ArrayList<>());
                groupMap.get(sorted).add(i);
            }
            else {
                groupMap.get(sorted).add(i);
            }
        }

        for (List<String> list : groupMap.values()){
            returnList.add(list);
        }

        return returnList;
    }
}
