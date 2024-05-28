import java.util.*;


public class Average{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        float avg = (a+b+c)/3;
        System.out.println(avg);
    }
}