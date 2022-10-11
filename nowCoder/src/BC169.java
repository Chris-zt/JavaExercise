// 未完成

import java.util.Scanner;

/**
 * 作者： chris
 * 时间:  2022-08-07
 */
public class BC169
{
    public static void main(String[] argc)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int[][] ack = new int[n + 1][m + 1];

        System.out.print(Ackmann(n, m, ack));
    }

    public static int Ackmann(int n, int m, int[][] ack)
    {
        if (ack[n][m] != 0) return ack[n][m];
        else
        {
            if (m == 0)
            {
                ack[n][m] = n + 1;
                return ack[n][m];
            }
            else if (n == 0)
            {
                ack[n][m] = Ackmann(m, 1, ack);
                return ack[n][m];
            }
            else
            {
                ack[n][m] = Ackmann(m - 1, Ackmann(m, n - 1, ack), ack);
                return ack[n][m];
            }
        }
    }
}
