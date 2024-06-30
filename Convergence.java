import java.util.Scanner;

public class Convergence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int convergence=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                //up
                if((i-1)>=0 && a[i-1][j]==1)convergence+=1;
                //down
                if((i+1)<n && a[i+1][j]==1)convergence+=1;
                //right
                if((j+1)<m && a[i][j+1]==1)convergence+=1;
                //down
                if((j-1)>=0 && a[i][j-1]==1)convergence+=1;
                }
            }
        }
        System.out.println(convergence);
    }
    
}
