import java.util.Arrays;

/**
 * 作者： chris
 * 时间:  2022-08-16
 */
public class t1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (k > 0) {
                if (num < 0) {
                    sum += (-1) * num;
                    k--;
                    min = Math.min(min, -1 * num);
                } else {
                    sum += num;
                    min = Math.min(min, num);
                    if (k % 2 == 1) {
                        sum -= 2 * min;
                    }
                    k = 0;
                }
            } else {
                sum += num;
            }
        }

        if (k % 2 == 1) {
            sum -= 2 * min;
        }

        return sum;
    }
}
