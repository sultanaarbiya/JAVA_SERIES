import java.util.*;

public class UserInput{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum;
        sum = a+b;
        int product = a*b;
        System.out.println("The sum of a and b is :"+sum);
        System.out.println("The product of a and b is :"+product);
    }
}