/**
 * 作者： chris
 * 时间:  2022-09-09
 */
public class t509 {
    public int fib(int n) {
        int f0 = 0, f1 = 1;
        int res = n;
        for (int i = 0; i < n - 1; i++) {
            res = f0 + f1;
            f0 = f1;
            f1 = res;
        }
        return res;
    }
}
