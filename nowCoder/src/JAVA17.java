import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者： chris
 * 时间:  2022-08-07
 */
public class JAVA17
{
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //write your code here......
        int left = 0, right = arr.length - 1;

        while(left < right){
            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
