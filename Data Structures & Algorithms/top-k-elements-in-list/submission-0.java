class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<List<Integer>> buckets = new ArrayList<>();
        int[] topKElements = new int[k];

        for (int i = 0; i <= nums.length; i++){
            buckets.add(new ArrayList<>());
        }

        for (int i : nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        //add the key:value pairs to the bucket
        for (int i : freqMap.keySet()){
            int value = freqMap.get(i);
            buckets.get(value).add(i);
        }

        int counter = 0;
        for (int i = buckets.size()-1; i > -1; i--){
            for (int j : buckets.get(i)){
                if (counter < k){
                    topKElements[counter] = j;
                    counter++;
                }
            }
        }

        return topKElements;

    }
}
