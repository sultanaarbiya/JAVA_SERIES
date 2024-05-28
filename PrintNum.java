import java.util.*;

public class  PrintNum{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    int n= sc.nextInt();
        int counter = 1;
        while(counter<=n)
        {
            System.out.print(counter + " ");
            counter++;
        }
    }
}


// public class  PrintNum{
//  public static void main(String args[]){
//         int counter = 1;
//         while(counter<=10)
//         {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }