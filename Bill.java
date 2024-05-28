import java.util.*;

public class Bill
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
        float Pencil = scan.nextFloat();
        float pen = scan.nextFloat();
        float eraser = scan.nextFloat();
        float Amount = Pencil+pen+eraser+0.18f;
      System.out.println("The Total Amount  is :"+ Amount);
    }
}