class Solution {

    public void moveZeroes(int[] nums) {

        int st = 0;
        int end = st + 1;

        while (end < nums.length) {

            if (nums[st] == 0 &&
                nums[end] != 0) {

                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
            }

            if (nums[st] != 0) {
                st++;
            }

            end++;
        }
    }
}