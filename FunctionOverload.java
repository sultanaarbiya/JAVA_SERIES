public  class FunctionOverload{
    public static int sum(int a,int b){
        return a+b;
    }
        public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args){

        System.out.println("The a and b  is" + " " + sum(5,6));
         System.out.println("The a and b and c is" + " " + sum(5.8f,6.8f));
    }
}