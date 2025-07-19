package Questions;

public class SearchInsertPos {
    public static void main(String[] args) {
        int arr[] = {45, 78,90,78};
        int target = 69;
        System.out.println(searchInsert(arr, target));
    }
static int searchInsert(int[] nums, int target) {
      int start = 0;
      int end = nums.length-1;
      
      while(start<=end){
       int mid = start + (end-start)/2;
      
       if(nums[mid] == target){
        return mid ;
       } if (nums[mid]>target){
        end  = mid - 1 ;
       }else {
start = mid + 1;
       }}
    return start; 
    }
   }
