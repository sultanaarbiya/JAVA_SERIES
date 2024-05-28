public class PrimeFun{
    public static boolean isPrime(int n){
        boolean Prime = true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0){
                Prime = false;
            }
        }
        return Prime;
    }
    public static void main(String[] args){
        int n=5;
        boolean Check = isPrime(n);
        System.out.println(Check);
    }
}