import java.util.HashSet;

/**
 * 作者： chris
 * 时间:  2022-08-25
 */
public class t202 {
    public boolean isHappy(int n) {
        HashSet<Integer> a = new HashSet<Integer>();
        while (n != 1) {
            if(a.contains(n)){
                return false;
            }
            a.add(n);
            n = change(n);
        }
        return true;
    }

    int change(int n){
        int res = 0;
        while (n != 0){
            int t = n % 10;
            res += (t * t);
            n = n / 10;
        }
        return res;
    }
}
