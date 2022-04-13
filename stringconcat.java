import java.util.*;
public class stringconcat{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=in.nextLine();
        System.out.println("Enter another string: ");
        String s2=in.nextLine();
        System.out.println("The concatenated string is: " + s1 +" "+ s2);
    }
}