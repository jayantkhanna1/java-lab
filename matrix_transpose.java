import java.util.*;
public class matrix_transpose{
    //make a program to find transpose of a matrix
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a[][]=new int [3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}