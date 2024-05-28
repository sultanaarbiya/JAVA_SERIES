public class Convert{
    public static void decToBin(int num){
        int pow=0;
        int binNum =0;
        while(num>0){
            int rem = num%2;
            binNum = binNum +(rem*(int)Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        System.out.println(binNum);
    }
        public static void main(String args[]){
            decToBin(23);
        }
    
}