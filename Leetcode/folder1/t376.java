/**
 * 作者： chris
 * 时间:  2022-08-15
 */
public class t376 {

    public int wiggleMaxLength(int[] nums) {

        int count = 1;
        int currDifference = 0, lastDifference = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                currDifference = nums[i] > nums[i - 1] ? 1 : -1;
                if (lastDifference != currDifference) {
                    count++;
                    lastDifference = currDifference;
                }
            }
        }

        return count;
    }
}
