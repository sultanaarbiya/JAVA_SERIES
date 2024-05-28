public class FunctionProduct{
    public static int Multiply(int a,int b){
        int multiply = a*b;
        return multiply;
    }
    public static  void main(String[] args){
        int a=3;
        int b=5;
        int product = Multiply(a,b);
        System.out.println("A * B = " + product);
    }
}