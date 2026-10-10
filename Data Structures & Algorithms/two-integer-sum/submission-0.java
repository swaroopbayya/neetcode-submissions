class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        while(left != length - 1){
            if(left == right){
                left++;
                right = length - 1;
            }
            if(nums[left] + nums[right] == target)
                return new int[]{left, right};
            right--;
        }
        return new int[]{0, 0};
    }
}
