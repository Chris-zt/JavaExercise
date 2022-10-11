import java.util.HashMap;

/**
 * 作者： chris
 * 时间:  2022-08-25
 */
public class t3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> checkMap = new HashMap<Character, Integer>();
        int res = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (checkMap.containsKey(s.charAt(i))) {
                i = checkMap.get(s.charAt(i));
                checkMap.clear();
                tmp = 0;
            } else {
                checkMap.put(s.charAt(i), i);
                res = Math.max(res, ++tmp);
            }
        }
        return res;
    }
}
