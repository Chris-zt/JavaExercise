public class t6167 {
	public boolean checkDistances(String s, int[] distance) {
		int[] tmp = new int[26];
		boolean[] appearance = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			appearance[index] = true;
			if (tmp[index] == 0) {
				tmp[index] = i + 1;
			} else {
				tmp[index] = i - tmp[index];
			}
		}

		for (int i = 0; i < tmp.length; i++) {
			if(appearance[i] && tmp[i] != distance[i]){
				return false;
			}
		}

		return true;
	}
}
