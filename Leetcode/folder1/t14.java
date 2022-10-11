/**
 * 作者： chris
 * 时间:  2022-08-26
 */
public class t14 {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < minLength) {
            char tmp = strs[0].charAt(i);
            for (String str : strs) {
                if(str.charAt(i) != tmp){
                    return res.toString();
                }
            }
            res.append(tmp);
            i++;
        }
        return res.toString();
    }
}
