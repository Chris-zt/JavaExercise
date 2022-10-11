
public class t1582 {
	public int numSpecial(int[][] mat) {
		int res = 0;
		int[] rows = new int[mat.length];
		int[] cols = new int[mat[0].length];

		for (int i = 0; i < mat.length; i++) {
			rows[i] = 0;
			for (int j = 0; j < mat[0].length; j++) {
				rows[i] += mat[i][j];
			}
		}

		for (int j = 0; j < mat[0].length; j++) {
			cols[j] = 0;
			for (int i = 0; i < mat.length; i++){
				cols[j] += mat[i][j];
			}
		}

		for (int i = 0; i < mat.length; i++) {
			if(rows[i] == 1){
				for (int j = 0; j < mat[0].length; j++) {
					if(cols[j] == 1 && mat[i][j] == 1){
						res++;
					}
				}
			}
		}

		return res;
	}
}
