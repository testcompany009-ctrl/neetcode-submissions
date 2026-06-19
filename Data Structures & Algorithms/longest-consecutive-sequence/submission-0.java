class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num + length)){
                length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
