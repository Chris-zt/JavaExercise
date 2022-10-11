/**
 * 作者： chris
 * 时间:  2022-07-20
 */
public class t209
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int res = Integer.MAX_VALUE;
        int sum = 0;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++)
        {
            sum += nums[fast];
            while (sum >= target)
            {
                res = Math.min(fast - slow + 1, res);
                sum -= nums[slow++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
