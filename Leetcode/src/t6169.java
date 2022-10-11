public class t6169 {
	public int longestNiceSubarray(int[] nums) {
        int res = 0;
		int tmp = 0;
		int num = 0;
		int slow = 0, fast = 0;

		while(fast < nums.length){
			if(((tmp & nums[fast]) == 0)){
				tmp = tmp | nums[fast];
				num++;
				res = Math.max(res, num);
				fast++;
			} else{
				for (int j = fast - 1; j >= slow; j--) {
					if((nums[j] & nums[fast]) != 0){
						slow = j + 1;
						tmp = nums[slow];
						num = 1;
						fast = j + 2;
						break;
					}
				}
			}
		}

		return res;
    }
}
