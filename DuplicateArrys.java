public class DuplicateArrys{
    public static boolean Duplicate(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {2,4,5,6,7,9,1};
        System.out.println(Duplicate(nums));
    }
}

