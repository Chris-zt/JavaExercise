/**
 * 作者： chris
 * 时间:  2022-07-19
 */
public class t704
{
    public int search(int[] nums, int target)
    {
        int l = nums.length;
        int left = 0, right = l - 1;
        int mid = (left + right) / 2;
        while(left <= right)
        {
            if(nums[mid] == target)
                return mid;
            else
            {
                if(target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }

            mid = (left + right) / 2;
        }

        return -1;
    }
}
