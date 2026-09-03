class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Deque<Integer> tempStack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++){
            while (!tempStack.isEmpty() && temperatures[i] > temperatures[tempStack.peek()]){
                int prev = tempStack.pop();
                output[prev] = i - prev;
            }

            tempStack.push(i);
        }

        return output;
    }
}
