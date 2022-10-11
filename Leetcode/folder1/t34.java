/**
 * 作者： chris
 * 时间:  2022-08-24
 */
public class t34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int leftBoundary = findRange(nums, left, right, target, true);
        int rightBoundary = findRange(nums, left, right, target, false);

        return new int[]{leftBoundary, rightBoundary};
    }

    public int findRange(int[] nums, int left, int right, int target, boolean lower) {
        int res = -1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] == target) {
                if (lower) {
                    res = mid;
                    right = mid - 1;
                } else {
                    res = mid;
                    left = mid + 1;
                }
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return res;
    }

}
