import java.util.Scanner;

/**
 * 作者： chris
 * 时间:  2022-08-06
 */
public class BC98
{
    public static void main(String[] argc)
    {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            num = sc.nextInt();
            for(int i = 0; i < num; i++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
