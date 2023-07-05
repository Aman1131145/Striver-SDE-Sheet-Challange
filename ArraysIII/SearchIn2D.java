package ArraysIII;

/**
 * SearchIn2D
 */
public class SearchIn2D {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5, 6, 7 },
                { 10, 11, 12, 13, 14 },
                { 20, 21, 22, 23, 24 },
                { 30, 31, 32, 33, 34 } };
        int target = 12;
        System.out.println(searchMatrix(arr, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int hi = (n * m) - 1;
        
        while(lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }
}