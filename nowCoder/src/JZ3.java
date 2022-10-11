import java.util.*;


public class JZ3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numbers int整型一维数组 
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        // write code here
        boolean[] flag = new boolean[numbers.length];

        for(int e : numbers) {
            if(flag[e])
            {
                return e;
            }
            else
                flag[e] = true;
        }
        return -1;
    }
}