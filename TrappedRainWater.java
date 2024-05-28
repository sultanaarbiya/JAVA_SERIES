public class TrappedRainWater{
    public static int rainwater(int arr[]){
         int n= arr.length;
        //leftmax
          int leftmax[] = new int[n];
          leftmax[0]=arr[0];
          for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
          }   
          
          //rightmax
          int Rightmax[] = new int[n];
         Rightmax[n-1]=arr[n-1];
          for(int i=n-2;i>=0;i--){
            Rightmax[i]=Math.max(arr[i],Rightmax[i+1]);
          } 
          
          // calculate trapped rain water
          int trappedwater =0;
          for(int i=0;i<n;i++){
          int waterLevel = Math.min(leftmax[i],Rightmax[i]);

            trappedwater += waterLevel - arr[i];

          }
          
          
          return trappedwater;
            }
    public static void main(String args[]){
        int arr[] = {4,2,0,6,2,3,5};
        System.out.println("The Trapped Rain Water is: " + " " +  rainwater(arr) );
    }
}