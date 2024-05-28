public class SelectionStart{

    public static void Select(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest =i;
            // int swap=0;
            for(int j=i+1;j<arr.length;j++){
                  if(arr[smallest]>j){
                    smallest = j;
                  }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
        }
    }
           public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
  
    
    public static void main(String args[]){
        int arr[] = {5,3,1,2,7,4};

        Select(arr);
        printArr(arr);
        // System.out.println(arr.length-1);
    }
}
