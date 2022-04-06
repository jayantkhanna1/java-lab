import java.util.*;
public class no_in_words{
    //make a program to print number in words
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String n1=Integer.toString(n);
        String s[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i=0;i<n1.length();i++){
            int j=n1.charAt(i)-48;
            System.out.print(s[j]+" ");
        }
        
    }
}