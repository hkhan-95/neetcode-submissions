class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        //construct left prod
        for (int i = 1; i < nums.length; i++){
            ans[i] = ans[i-1] * nums[i];
        }

        //construct right prod
        ans[nums.length -1] = ans[nums.length -2];
        prod *= nums[nums.length - 1];

        for (int j = nums.length -2; j > 0; j--){
            ans[j] = prod * ans[j-1];
            prod *= nums[j];
        }
        ans[0] = prod;

        return ans;
    }
}
