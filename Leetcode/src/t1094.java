/**
 * 作者： chris
 * 时间:  2022-10-01
 */
public class t1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] station = new int[1001];
        for (int[] trip : trips) {
            station[trip[1]] += trip[0];
            station[trip[2]] -= trip[0];
        }

        int t = 0;
        for (int num : station) {
            t += num;
            if (t > capacity) {
                return false;
            }
        }
        return true;
    }
}
