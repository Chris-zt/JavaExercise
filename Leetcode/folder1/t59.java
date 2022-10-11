/**
 * 作者： chris
 * 时间:  2022-07-20
 */
public class t59
{
    public int[][] generateMatrix(int n)
    {
        int[][] res = new int[n][n];

        int num = 1;
        for (int i = 0; i < n / 2; i++)
        {
            for (int j = i; j < n - 1 - i; j++)
            {
                res[i][j] = num++;
            }

            for (int j = i; j < n - 1 - i; j++)
            {
                res[j][n - 1 - i] = num++;
            }

            for (int j = n - 1 - i; j > i; j--)
            {
                res[n - 1 - i][j] = num++;
            }

            for(int j = n - 1 - i; j > i; j--)
            {
                res[j][i] = num++;
            }
        }

        if(n % 2 == 1)
            res[n/2][n/2] = num;

        return res;
    }
}
