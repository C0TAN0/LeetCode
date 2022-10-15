package _2022._10._15;

/*
 *You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 *
 *A row i is weaker than a row j if one of the following is true:
 *
 *The number of soldiers in row i is less than the number of soldiers in row j.
 *Both rows have the same number of soldiers and i < j.
 *Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Problem1337 {
    public static void main(String[] args) {
        System.out.println(kWeakestRows(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}}, 2).toString());

    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int count[][] = new int[mat.length][2];
        int result[] = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int soldierCount = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    soldierCount = soldierCount + 1;
                }
            }
            count[i][0] = i;
            count[i][1] = soldierCount;
        }

        Arrays.sort(count, new Comparator<int[]>() {
            public int compare(int[] t0, int[] t1) {
                return t0[1] - t1[1];
            }
        });

        for (int i = 0; i < k; i++) {
            result[i] = count[i][0];
        }

        return result;
    }
}
