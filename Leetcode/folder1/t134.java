/**
 * 作者： chris
 * 时间:  2022-08-16
 */
public class t134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] difference = new int[gas.length];

        for (int i = 0; i < gas.length; i++) {
            difference[i] = gas[i] - cost[i];
        }

        int index = 0, sum = 0;

        for (int i = 0; i < difference.length; i++) {
            sum += difference[i];
            if (sum < 0) {
                index = i + 1;
                sum = 0;
            }
        }

        for (int i = 0; i < index; i++) {
            sum += difference[i];
            if (sum < 0)
                return -1;
        }

        return index;
    }
}
