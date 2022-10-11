import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 作者： chris
 * 时间:  2022-10-08
 */
public class t18 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            List<Integer> t = new ArrayList<>();
            t.add(nums[i]);
            findAnser(t, nums, target - nums[i], i + 1, 3);
        }
        return res;
    }

    void findAnser(List<Integer> t, int[] nums, int target, int beginIndex, int num){
        if(nums.length - beginIndex <= 1) {
            return;
        }
        if(num == 2){
            int left = beginIndex, right = nums.length - 1;
            while(left < right){
                if (left > beginIndex && nums[left - 1] == nums[left]) {
                    continue;
                }
                if(nums[left] + nums[right] == target){
                    List<Integer> tmp = new ArrayList<>(t);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    res.add(tmp);
                    left++;
                    right--;
                }else if(nums[left] + nums[right] > target){
                    right--;
                }else{
                    left++;
                }
            }
        } else {
            for (int i = beginIndex; i < nums.length - num + 1; i++) {
                if (i > beginIndex && nums[i - 1] == nums[i]) {
                    continue;
                }
                List<Integer> tmp = new ArrayList<>(t);
                tmp.add(nums[i]);
                findAnser(tmp, nums, target - nums[i], i + 1, num - 1);
            }
        }
    }
}
