import java.util.*;
public class multiply_matrix{
    //make a program to multiply two matrix
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
                c[i][j]=0;
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                for(int k=0;k<c[i].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
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