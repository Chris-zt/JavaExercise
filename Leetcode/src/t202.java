import java.util.HashSet;

/**
 * 作者： chris
 * 时间:  2022-10-08
 */
public class t202 {
    public boolean isHappy(int n) {
        HashSet<Integer> tmp = new HashSet<Integer>();
        while (n != 1 && !tmp.contains(n)) {
            tmp.add(n);
            int m = 0;
            while (n != 0) {
                m += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = m;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
