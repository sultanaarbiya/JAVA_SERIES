// import java.util.*;

// public class Reverse{
//     public static void main(String args[]){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the num to reverse");
//         int N = input.nextInt();
//         int rev;

//         while(N>0){
//              rev = N%10;
//              System.out.print(rev);
//                N = N/10;

//         }
//         System.out.println();
//     }
// }

// Reverse a given  no
import java.util.*;

public class Reverse{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num to reverse");
        int N = input.nextInt();
        int org= N;
        int rev,reverseNum=0;

        while(N>0){
             rev = N%10;
           reverseNum = reverseNum*10+rev;
               N = N/10;

        }
        System.out.println(reverseNum);
    }
}