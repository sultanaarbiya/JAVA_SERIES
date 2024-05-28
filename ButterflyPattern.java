public class ButterflyPattern{
    public static void butterfly(int n){
        // phase-1
        //outerloop
        for(int i=1;i<=n;i++)
        {
            // stars1 i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            // spaces (2*(n-i)) 
             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            } 
            // stars 2
              for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println();
        }

        //phase-2

        for(int i=n;i>=1;i--)
        {
            // stars1 i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            // spaces (2*(n-i)) 
             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            } 
            // stars 2
              for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    public static void main(String args[]){
        butterfly(5);
    }
}