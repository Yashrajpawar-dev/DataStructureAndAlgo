package Questions;

public class CountRotation {
     public static void main(String[] args) {
        int[] arr = {2,5,7,8,9};

       
        System.out.println(search(arr));
    }

static int search(int[] nums){
    int pivot = FindPivot(nums);
return pivot+1;
    
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

