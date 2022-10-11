import java.util.Arrays;

/**
 * 作者： chris
 * 时间:  2022-08-15
 */
public class t455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;

        for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {
            while(j < s.length && g[i] > s[j]){
                j++;
            }
            if(j < s.length){
                count++;
            }
        }

        return count;
    }
}
