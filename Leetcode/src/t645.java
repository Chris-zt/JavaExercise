import java.util.Arrays;

public class t645 {
	public int[] findErrorNums(int[] nums) {
		Arrays.sort(nums);
		int[] res = new int[2];
		res[1] = nums.length;
		int tmp = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == nums[i+1]){
				res[0] = nums[i];
			} else{
				if(tmp == nums[i]){
					tmp++;
				} else{
					res[1] = tmp;
					tmp += 2;
				}
			}
		}
		return res;
    }
}
