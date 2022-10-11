import java.util.Arrays;

/**
 * 作者： chris
 * 时间:  2022-08-26
 */
public class t43 {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];

        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                res[i + j + 1] += ((int) (num1.charAt(i)) - 48) * ((int) (num2.charAt(j)) - 48);
                //System.out.println("i : " + i + "    j : " + j +  "   res : " + res[i + j + 1]);
            }
        }


        for (int i = res.length - 1; i > 0; i--) {
            if (res[i] >= 10) {
                res[i - 1] += res[i] / 10;
                res[i] = res[i] % 10;
            }
        }
        System.out.println(Arrays.toString(res));

        StringBuilder sb = new StringBuilder();
        for (int i = (res[0] == 0 ? 1 : 0 ); i < res.length; i++) {
            sb.append((char) (res[i] + 48));
        }

        return sb.toString();

    }
}
