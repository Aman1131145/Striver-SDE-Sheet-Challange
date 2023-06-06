import java.util.Scanner;

/**
 * SetMatrixZeros
 */
public class SetMatrixZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        setZeroes(arr);
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void setZeroes(int[][] matrix) {
    
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row[] = new boolean[n];
        boolean column[] = new boolean[m];
    
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;;
                }
            }
        }
        for(int i = 0; i < n; i++){
            boolean r = row[i];
            for(int j = 0; j < m; j++){
                boolean c = column[j];
                if(r || c){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    
}