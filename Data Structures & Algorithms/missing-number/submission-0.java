class Solution {
    public int missingNumber(int[] nums) {
        
        int range = nums.length;
        int[] array = new int[range + 1];
        for(int num : nums)
            array[num]++;
        for(int i = 0; i < range + 1; i++) {
            if(array[i] == 0)
                return i;
        }
        return 0;
    }
}
