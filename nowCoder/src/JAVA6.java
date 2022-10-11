import java.util.Scanner;

/**
 * 作者： chris
 * 时间:  2022-08-07
 */
public class JAVA6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        //write your code here......
        double res = weight / (height * height);

        if(res < 18.5)
            System.out.print("偏瘦");
        else if(res >= 18.5 && res < 20.9)
            System.out.print("苗条");
        else if(res >= 20.9 && res < 24.9)
            System.out.print("适中");
        else
            System.out.print("偏胖");
    }
}
