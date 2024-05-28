// public class Sum{
//     public static void main(String args[]){
//         int a=10,b=20,sum;
//         sum = a+b;
//         System.out.println("The sum of a and b is :"+sum);
//     }
// }

// Sum of n natural numbers
import java.util.*;

public class Sum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to sum it:");
        int num = s.nextInt();
        int count=0,sum=0;
        while(count<=num)
        {
            sum = sum +count;
            count++;
        }
    
        System.out.println("The sum of count is :" + sum);
    }
}