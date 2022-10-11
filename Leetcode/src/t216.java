import java.util.ArrayList;
import java.util.List;

/**
 * 作者： chris
 * 时间:  2022-10-10
 */
public class t216 {

    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        findAnswer(new ArrayList<Integer>(), 1, k, n);
        return res;
    }

    void findAnswer(List<Integer> a, int begin, int k, int n) {
        if (k == 1) {
            if (n >= begin && n <= 9) {
                List<Integer> tmp = new ArrayList<Integer>(a);
                tmp.add(n);
                res.add(tmp);
            }
        } else {
            for (int i = begin; i <= 9 - k + 1; i++) {
                //减枝
                if(n >= num(i, k)){
                    //还有机会
                    List<Integer> tmp = new ArrayList<Integer>(a);
                    tmp.add(i);
                    findAnswer(tmp, i + 1, k - 1, n - i);
                }
            }
        }
    }

    int num(int i, int k){
        return ((i + i + k - 1) * k / 2);
    }
}
