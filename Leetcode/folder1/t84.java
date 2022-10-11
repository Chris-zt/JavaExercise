/**
 * 作者： chris
 * 时间:  2022-08-27
 */
public class t84 {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            res = Math.max(res, rectangleArea(i, heights));
        }
        return res;
    }

    public int rectangleArea(int i, int[] heights) {
        int num = 1;
        int a = i - 1;
        while (a >= 0 && heights[a] >= heights[i]) {
            num++;
            a--;
        }
        a = i + 1;
        while (a < heights.length && heights[a] >= heights[i]) {
            num++;
            a++;
        }
        return heights[i] * num;
    }

}
