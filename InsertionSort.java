public class InsertionSort{

    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =arr[i];
            int pre = i-1;
            // int swap=0;
         while(pre >=0 && arr[pre] > curr){
            arr[pre+1] = arr[pre];
            pre--;
         }
          arr[pre+1]= curr;
        }
    }
           public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
  
    
    public static void main(String args[]){
        int arr[] = {5,3,1,2,7,4};

        insertion(arr);
        printArr(arr);
        // System.out.println(arr.length-1);
    }
}
