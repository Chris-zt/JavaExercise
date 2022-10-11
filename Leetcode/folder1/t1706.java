/**
 * 作者： chris
 * 时间:  2022-08-26
 */
public class t1706 {
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            res[i] = fallOff(i, grid);
        }
        return res;
    }

    public int fallOff(int i, int[][] grid) {
        int row = 0, column = i;
        while (row < grid.length) {
            if (grid[row][column] == 1) {
                if (column + 1 == grid[0].length || grid[row][column + 1] == -1) {
                    return -1;
                } else {
                    row += 1;
                    column += 1;
                }
            } else {
                if (column - 1 < 0 || grid[row][column - 1] == 1) {
                    return -1;
                } else {
                    row += 1;
                    column -= 1;
                }
            }
        }

        return column == grid[0].length ? -1 : column;
    }

}

