import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 作者： chris
 * 时间:  2022-10-10
 */
public class t39 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        findAnswer(new ArrayList<Integer>(), candidates, 0, target);
        return res;
    }

    void findAnswer(List<Integer> a, int[] candidates, int begin, int target) {
        for (int i = begin; i < candidates.length; i++) {
            if (candidates[i] < target) {
                List<Integer> tmp = new ArrayList<Integer>(a);
                tmp.add(candidates[i]);
                findAnswer(tmp, candidates, i, target - candidates[i]);
            } else if (candidates[i] == target) {
                List<Integer> tmp = new ArrayList<Integer>(a);
                tmp.add(candidates[i]);
                res.add(tmp);
            }
        }
    }
}
