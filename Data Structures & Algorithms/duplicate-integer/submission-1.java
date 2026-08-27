class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueList = new HashSet<>();

        for (int i : nums){
            if (uniqueList.contains(i)){
                return true;
            }
            uniqueList.add(i);
        }
        return false;
    }
}