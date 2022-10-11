import java.util.HashSet;
import java.util.Scanner;

public class JAVA38
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        HashSet<Character> hs = new HashSet<>();

        //write your code here......
        for (char c : str.toCharArray())
        {
            hs.add(c);
        }

        for (char c : hs)
        {
            System.out.print(c);
        }
    }
}