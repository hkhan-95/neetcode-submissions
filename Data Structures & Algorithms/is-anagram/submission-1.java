class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        

        for (char c : s.toCharArray()){
            sMap.put(c , sMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (!sMap.containsKey(c)){
                return false;
            }

            sMap.put(c, sMap.get(c) - 1);
            if (sMap.get(c) == 0){
                sMap.remove(c);
            }
        }

        if (sMap.size() != 0){
            return false;
        }

        return true;
    }
}
