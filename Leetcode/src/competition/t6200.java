package competition;

/**
 * 作者： chris
 * 时间:  2022-10-09
 */
public class t6200 {
    public int hardestWorker(int n, int[][] logs) {
        int res = 0;
        int max = 0;
        int last = 0;
        for (int i = 0; i < logs.length; i++) {
            if(logs[i][1] - last > max || (logs[i][1] - last == max && logs[i][0] < res)){
                max = logs[i][1] - last;
                res = logs[i][0];
            }
            last = logs[i][1];
        }
        return res;
    }
}
