import java.lang.reflect.Array;
import java.util.Arrays;

public class t268 {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != i){
				return i;
			}
		}
		return nums.length;
    }
}
