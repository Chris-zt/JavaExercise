/**
 * 作者： chris
 * 时间:  2022-08-10
 */
public class offer10 {
    public int fib(int n) {
        if(n < 2)
            return n;
        int a = 0, b = 1;
        int res = 1;
        for (int i = 0; i < n - 2; i++) {
            res += b;
            res %= 1000000007;
            a = b;
            b = res;
        }
        return res;
    }
}
