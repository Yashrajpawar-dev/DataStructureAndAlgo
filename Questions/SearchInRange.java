package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInRange {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public static void main(String[] args) {
    int[] nums = {4,7,7,7,7,8,8,9,9,};
    int target = 8;
    System.out.println(Arrays.toString(searchRange(nums, target)));
    
}
static int[] searchRange(int[] nums, int target) {
    int[] ans = {-1,-1};
    
    //Check for the first occurence of target
   int start = search(nums, target,true);
     int end = search(nums, target, false);
     ans[0] = start;
     ans[1] = end;
     return ans;
    }
static int search(int nums[], int target,boolean findStartIndex){
    int ans = -1;
int lower = 0;
    int upper = nums.length-1;
    while(lower<=upper){
      //  int mid = (lower+upper)/2;
      int mid = lower + (upper-lower)/2;
        if (nums[mid] == target) {
          ans = mid;
          if(findStartIndex){
            upper = mid - 1;
          }else {
            lower = mid+1;
          }

        }else if(target > nums[mid]){
            lower = mid + 1;
        }else{
            upper = mid -1;
        }
    }
    return ans;
}
}
