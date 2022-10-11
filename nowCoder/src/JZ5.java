/**
 * 作者： chris
 * 时间:  2022-08-09
 */
public class JZ5 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace(String s) {
        // write code here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                str.append("%20");
            else
                str.append(s.charAt(i));
        }
        return str.toString();
    }
}
