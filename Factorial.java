public  class Factorial{
    public static int check(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact= fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        int n=5;
        int fact = check(n);
        System.out.println("The factorial of " + n +" "+ "is" + " " + fact);
    }
}