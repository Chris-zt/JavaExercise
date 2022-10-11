import java.util.Scanner;

/**
 * 作者： chris
 * 时间:  2022-08-06
 */
public class BC142
{
    public static void main(String[] argc)
    {
        // 输入
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        char[][] mines = new char[n][m];

        for (int i = 0; i < n; i++)
        {
            String s = sc.next();
            mines[i] = s.toCharArray();
        }

        // 输入无误
/*        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(mines[i][j]);
            }
            System.out.println();
        }*/

        // 处理
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (mines[i][j] == '*')
                {
                    System.out.print('*');
                    continue;
                }

                int num = 0;
                for (int k = i - 1; k <= i + 1; k++)
                {
                    if (k >= 0 && k < n)
                    {
                        for (int l = j - 1; l <= j + 1; l++)
                        {
                            if (l >= 0 && l < m && mines[k][l] == '*') num++;
                        }
                    }
                }
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
