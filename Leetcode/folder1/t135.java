/**
 * 作者： chris
 * 时间:  2022-08-16
 */
public class t135 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i] < ratings[i - 1] && candy[i - 1] <= candy[i]) {
                candy[i - 1] = candy[i] + 1;
            }
        }

        int sum = 0;
        for (int n : candy) {
            sum += n;
        }

        return sum + candy.length;
    }
}
