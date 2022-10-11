import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 作者： chris
 * 时间:  2022-10-10
 */
public class t40 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        findAnswer(new ArrayList<Integer>(), candidates, 0, target);
        return res;
    }

    void findAnswer(List<Integer> a, int[] candidates, int begin, int target) {
        int last = candidates[begin] - 1;
        for (int i = begin; i < candidates.length; i++) {
            if (candidates[i] == last) {
                continue;
            }
            if (candidates[i] < target && i < candidates.length-1) {
                List<Integer> tmp = new ArrayList<Integer>(a);
                tmp.add(candidates[i]);
                findAnswer(tmp, candidates, i + 1, target - candidates[i]);
            } else if (candidates[i] == target) {
                List<Integer> tmp = new ArrayList<Integer>(a);
                tmp.add(candidates[i]);
                res.add(tmp);
            }
            last = candidates[i];
        }
    }
}
