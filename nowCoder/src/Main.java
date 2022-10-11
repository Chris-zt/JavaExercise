import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * 作者： chris
 * 时间:  2022-08-10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num = scanner.nextDouble();

        //write your code here......
        System.out.println(Math.abs(num));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.log(num ));
        System.out.println(Math.sin(num));

    }
}