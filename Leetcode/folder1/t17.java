import java.util.ArrayList;
import java.util.List;

/**
 * 作者： chris
 * 时间:  2022-08-29
 */
public class t17 {

    public ArrayList<String> res = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return res;
        }

        ArrayList<String> alphabet = new ArrayList<>();

        alphabet.add("abc");
        alphabet.add("def");
        alphabet.add("ghi");
        alphabet.add("jkl");
        alphabet.add("mno");
        alphabet.add("pqrs");
        alphabet.add("tuv");
        alphabet.add("wxyz");

        for (int i = 0; i < alphabet.get((int) (digits.charAt(0) - '2')).length(); i++) {
            StringBuilder tmp = new StringBuilder();
            tmp.append(alphabet.get((int) (digits.charAt(0) - '2')).charAt(i));
            generateCombinations(alphabet, 1, tmp, digits);
        }
        return res;
    }

    public void generateCombinations(ArrayList<String> alphabet, int index, StringBuilder last, String digits) {
        if (index == digits.length()) {
            res.add(last.toString());
        } else {
            for (int i = 0; i < alphabet.get((int) (digits.charAt(index) - '2')).length(); i++) {
                StringBuilder tmp = new StringBuilder(last);
                tmp.append(alphabet.get((int) (digits.charAt(index) - '2')).charAt(i));
                generateCombinations(alphabet, index + 1, tmp, digits);
            }
        }
    }
}
