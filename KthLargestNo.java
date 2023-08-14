import java.util.Arrays;

public class KthLargestNo {
    public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
}
