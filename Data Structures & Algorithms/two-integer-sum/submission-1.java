class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberTracker = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];

            if (numberTracker.containsKey(difference)){
                return new int[]{numberTracker.get(difference), i};
            }

            numberTracker.put(nums[i], i);
        }
        
        return new int[2];
    }
}
