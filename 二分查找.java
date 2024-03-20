class Solution {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;

        if(target < nums[left] || target > nums[right]){
            return -1;
        }
        while(left <= right){
            int middle = (right - left)/2 + left;
            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle] < target){
                left = middle + 1;
            }
            if(nums[middle] > target){
                right = middle - 1;
            }
        }
        return -1;
    }
}