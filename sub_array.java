//make a java program to sub two arrays
import java.util.*;
public class sub_array{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a[]=new int [5];
        int b[]=new int [5];
        for (int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        for (int i=0;i<b.length;i++){
            b[i]=in.nextInt();
        }
        int c[]=new int [a.length];
        for(int i=0;i<(a.length);i++){
            c[i]=a[i]-b[i];
        }
        for(int i=0;i<(c.length);i++){
            System.out.print(c[i]+" ");
        }
    }
}