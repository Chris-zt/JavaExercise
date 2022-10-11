/**
 * 作者： chris
 * 时间:  2022-08-16
 */
public class t860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveNum = 0, tenNum = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fiveNum++;
            } else if (bill == 10) {
                if (fiveNum == 0) {
                    return false;
                } else {
                    fiveNum--;
                    tenNum++;
                }
            } else {
                if (tenNum > 0 && fiveNum > 0) {
                    fiveNum--;
                    tenNum--;
                } else if (fiveNum >= 3) {
                    fiveNum -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
