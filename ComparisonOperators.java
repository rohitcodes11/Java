// COMPARISON POERATORS -- (==,!=,<,>,<=,>=,)
/*public class ComparisonOperators {
    public static void main (String[]args){
        int a = 6;
        int b = 10;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
             
    }
    
}*/

// now ab scanner ka use krke dekhte hai 
import java.util.Scanner;
public class ComparisonOperators{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("a==b : "+ (a==b));
        System.out.println("a!=b : " + (a!=b));
        System.out.println("a<b : " + (a<b));
        System.out.println("a>b : " + (a>b));
        System.out.println("a<=b : " + (a<=b));
        System.out.println("a>=b : " + (a>=b));



    }
}
