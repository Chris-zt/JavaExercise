import java.util.ArrayList;
import java.util.List;

/**
 * 作者： chris
 * 时间:  2022-10-10
 */
public class t77 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        findAnswer(new ArrayList<Integer>(), 1, n, k);
        return res;
    }

    void findAnswer(List<Integer> a, int begin, int end, int k) {
        if (k == 1) {
            for (int i = begin; i <= end; i++) {
                List<Integer> tmp = new ArrayList<Integer>(a);
                tmp.add(i);
                res.add(tmp);
            }
        } else {
            for (int i = begin; i <= end - k + 1; i++) {
                List<Integer> tmp = new ArrayList<Integer>(a);
                tmp.add(i);
                findAnswer(tmp, i + 1, end, k - 1);
            }
        }
    }
}
