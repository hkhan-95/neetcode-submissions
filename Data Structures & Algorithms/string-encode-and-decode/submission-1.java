class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (String s : strs){
            str.append(s.length());
            str.append(';');
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> returnList = new ArrayList<>();

        int l = 0;
        int r = 0;

        while (r < str.length()){
            while (str.charAt(r) != ';'){
                r++;
            }
            Integer size = Integer.parseInt(str.substring(l,r));
            String decodedWord = str.substring(r+1, r+1+size);

            returnList.add(decodedWord);

            l = r + 1 + size;
            r = l;
        }
        
        return returnList;
    }
}
