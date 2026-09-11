class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int count=len;
        for (int i=0;i<len;i++){
            if(nums[i]==val){
                nums[i]=Integer.MAX_VALUE;
                count--;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}