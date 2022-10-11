import java.util.Scanner;

/**
 * 作者： chris
 * 时间:  2022-08-06
 */
public class BC114
{
    public static void main(String[] argc)
    {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        for (int i = 0; i < h; i++)
        {
            printSpace(3 * (h - i - 1));
            treeTops1(i + 1);
            System.out.println();

            printSpace(3 * (h - i - 1));
            treeTops2(i + 1);
            System.out.println();

            printSpace(3 * (h - i - 1));
            treeTops3(i + 1);
            System.out.println();
        }

        for (int i = 0; i < h; i++)
        {
            printSpace(3 * h - 1);
            System.out.println('*');
        }
    }

    public static void treeTops1(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.print("  *   ");
        }
    }

    public static void treeTops2(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.print(" * *  ");
        }
    }

    public static void treeTops3(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.print("* * * ");
        }
    }

    public static void printSpace(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.print(' ');
        }
    }
}
