package competition;

/**
 * 作者： chris
 * 时间:  2022-10-09
 */
public class t6201 {
    public int[] findArray(int[] pref) {
        int[] res = new int[pref.length];
        res[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            res[i] = pref[i - 1] ^ pref[i];
        }
        return res;
    }
}
