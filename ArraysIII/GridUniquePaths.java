package ArraysIII;

import java.util.Scanner;

public class GridUniquePaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(uniquePaths(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
    public static int combination(int n,int r){
        double ans=1,N=n;
        for(double i=1;i<=r;i++){
            ans*=(N-(i-1));
            ans/=i;
        }
        return (int)ans;
    }
    public static int uniquePaths(int m, int n) {
        return combination(m+n-2,Math.min(n-1,m-1));
    }
    
}
