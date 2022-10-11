/**
 * 作者： chris
 * 时间:  2022-07-20
 */
public class t977
{
    public int[] sortedSquares(int[] nums)
    {
        int l = nums.length;
        int index = l - 1;
        int[] ans = new int[l];

        int left = 0, right = l - 1;

        while(left <= right)
        {
            if(nums[left] + nums[right] > 0)
                ans[index--] = (int) Math.pow(nums[right--], 2);
            else
                ans[index--] = (int) Math.pow(nums[left++], 2);
        }

        return ans;
    }
}
