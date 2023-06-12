import java.util.*;

public class Rotate {
    
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate90(arr);
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                temp.add(arr[i][j]);
            }
            array.add(temp);
        }
        rotateRight(array);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate90(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(i, j, j, i, matrix);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(i, j, i, n - 1 - j, matrix);
            }
        }
    }

    public static void swap(int i, int j, int i1, int j1, int arr[][]) {
        int temp = arr[i][j];
        arr[i][j] = arr[i1][j1];
        arr[i1][j1] = temp;
    }

    public static void rotateRight(ArrayList<ArrayList<Integer>> list) {
        int n = list.size();
        int m = list.get(0).size();
        int u = 0;
        int d = n - 1;
        int l = 0;
        int r = m - 1;
        while (l < r && u < d) {
            int prev = list.get(u + 1).get(l);
            for (int i = l; i <= r; i++) {
                int curr = list.get(u).get(i);
                list.get(u).set(i, prev);
                prev = curr;
            }
            u++;
            for (int i = u; i <= d; i++) {
                int curr = list.get(i).get(r);
                list.get(i).set(r, prev);
                prev = curr;
            }
            r--;
            for (int i = r; i >= l; i--) {
                int curr = list.get(d).get(i);
                list.get(d).set(i, prev);
                prev = curr;
            }
            d--;
            for (int i = d; i >= u; i--) {
                int curr = list.get(i).get(l);
                list.get(i).set(l, prev);
                prev = curr;
            }
            l++;
        }
    }
}
