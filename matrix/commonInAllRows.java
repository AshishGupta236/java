import java.util.*;

public class commonInAllRows {
    public static void main(String args[]) {

        int[][] mat = new int[][] {
                { 1, 2, 1, 4, 8 },
                { 3, 7, 8, 5, 1 },
                { 8, 7, 7, 3, 1 },
                { 8, 1, 2, 7, 9 } };
        HashMap<Integer, Integer> map = new HashMap<>();
        int r = mat.length;
        int c = mat[0].length;
        for (int i = 0; i < c; i++) {
            map.put(mat[0][i], 1);
        }
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map.containsKey(mat[i][j]) && map.get(mat[i][j]) == i) {
                    map.put(mat[i][j], map.get(mat[i][j]) + 1);
                }
                if (i == r - 1 && map.containsKey(mat[i][j]) && map.get(mat[i][j]) == r) {
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}
