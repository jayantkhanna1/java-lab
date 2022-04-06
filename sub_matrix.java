import java.util.*;
public class sub_matrix{
    //make a program to subtract two matrix
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a[][]=new int [3][3];
        int b[][]=new int [3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=in.nextInt();
            }
        }
        int c[][]=new int [3][3];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}