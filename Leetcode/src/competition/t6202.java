package competition;

import java.util.*;

/**
 * 作者： chris
 * 时间:  2022-10-09
 */
public class t6202 {
    public String robotWithString(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        for (int i = s.length() - 1; i >= 0; i--) {
            stack1.push(s.charAt(i));
        }
        Stack<Character> stack2 = new Stack<Character>();
        ArrayList<Character> res = new ArrayList<Character>();

        while(!stack1.isEmpty()){
            Stack<Character> stacktmp = new Stack<Character>(stack1);
            char[] tmp = new char[stack1.size()];



            char min = 'z';
            int num = 0;
            //求出stack1最小的字母
            for (int i = 0; i < tmp.length; i++) {
                if(tmp[i] <= min){
                    min = tmp[i];
                }
            }
            while(stack2. peek()  == min){
                res.add(stack2.pop());
            }
            //求出stack1最小的字母的数量
            for (int i = 0; i < tmp.length; i++) {
                if(tmp[i] == min){
                    num++;
                }
            }
            while(num > 0){
                char c = 'a';
                while((c = stack1.pop()) != min){
                    stack2.push(c);
                }
                res.add(c);
                num--;
            }
        }
        while(!stack2.isEmpty()){
            res.add(stack2.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            sb.append(res.get(i));
        }
        return sb.toString();
    }
}
