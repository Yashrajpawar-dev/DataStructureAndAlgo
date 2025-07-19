package Questions;
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedArray {
public static void main(String[] args) {
        int[] arr = {1};

        int key = 0;
       System.out.println( search(arr, key ));
}
static int search(int[] nums, int target){





    int pivot = FindPivot(nums);

     if (pivot == -1) {
            return Binarysearch(nums, target, 0, nums.length - 1);
        }

        // If pivot element itself is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Decide which part to search
        if (target >= nums[0]) {
            return Binarysearch(nums, target, 0, pivot - 1);
        } else {
            return Binarysearch(nums, target, pivot + 1, nums.length - 1);
        }
}
static int Binarysearch(int[] arr, int key,int lower, int upper){
   
    while(lower<=upper){
      //  int mid = (lower+upper)/2;
      int mid = lower + (upper-lower)/2;
        if ( arr[mid] == key) {
            return mid;

        }else if(key > arr[mid]){
            lower = mid + 1;
        }else{
            upper = mid -1;
        }
    }
    return -1;
}
static int FindPivot(int[] nums) {
        
    
int lower = 0;
    int upper = nums.length-1;
    while(lower<=upper){
      //  int mid = (lower+upper)/2;
      int mid = lower + (upper-lower)/2;
        if (mid < upper && nums[mid] > nums[mid + 1]) {
    return mid;
}
if (mid > lower && nums[mid] < nums[mid - 1]) {
    return mid - 1;
}

if (nums[mid] >= nums[lower]) {
    lower = mid + 1; 
} else {
    upper = mid - 1; 
}

    }
    return -1;
}
}
