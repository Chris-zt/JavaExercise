import java.util.Scanner;

/**
 * 作者： chris
 * 时间:  2022-08-23
 */
public class JAVA29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //write your code here......
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for (int i = (str.length() - 1) % 3 + 1; i <= str.length(); i += 3) {
            sb.append(str.substring(left, i));
            if(i != str.length())
                sb.append(",");
            left = i;
        }

        System.out.println(sb.toString());
    }
}
