public class Binary_Decimal{
    public static void binToDec(int num){
       int pow=0;
       int decNum =0;
       while(num>0){
       int lastDigit = num %10;
       decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
       pow++;
       num = num/10;
       }
       System.out.println(decNum);
    }
    public static void main(String args[]){
      binToDec(18);
    }
}