public class BubbleSort{

    public static void Sort(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            // int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                   if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   }
            }
        }
    }
    
        public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
    public static void main(String args[]){
        int arr[] = {5,3,1,2,7,4};
        Sort(arr);
        printArr(arr);
        // System.out.println(arr.length-1);
    }
}
