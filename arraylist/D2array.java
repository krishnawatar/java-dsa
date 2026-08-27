import java.util.*;
public class D2array {
    public static void search(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int m=matrix.length;
        int n=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix);
    }
}
