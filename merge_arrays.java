//make a program to merge two arrays

import java.util.*;
public class merge_arrays{
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
		int c[]=new int [a.length+b.length];
		for(int i=0;i<(a.length);i++){
			c[i]=a[i];
		}
		int g=0;
		for(int i=a.length;i<(b.length+a.length);i++){
			c[i]=b[g];
			g++;
		}
		for(int i=0;i<(b.length+a.length);i++){
			System.out.print(c[i]+" ");
		}
	}
}

