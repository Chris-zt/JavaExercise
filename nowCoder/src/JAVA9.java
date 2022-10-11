/**
 * 作者： chris
 * 时间:  2022-08-07
 */
public class JAVA9
{
    public static void main(String[] args)
    {
        long a = 9;
        long res = 0;
        for (int i = 0; i < 10; i++)
        {
            res += a;
            a = a * 10 + 9;
        }
        System.out.print(res);

    }
}
