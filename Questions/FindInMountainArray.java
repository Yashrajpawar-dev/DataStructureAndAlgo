package Questions;
// https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,3,1};

        int key = 1;
       System.out.println(search(arr, key));
    }

   static int search(int arr[], int key)
{
    int start = 0;
    int end = PeakElement(arr);
    
    boolean isAscen = arr[start] < arr[end];
 while(start<=end){
      //  int mid = (lower+upper)/2;
      int mid = start + (end-start)/2;
        if (arr[mid] == key) {
            return mid;
        }
        else if ( isAscen){
            if(key > arr[mid]){
            start = mid + 1;
        }else{
            end = mid -1;
        }
        }else{
           if(key < arr[mid]){
       
              start = mid + 1;
        }else{
               end = mid -1;
        }
        }
            


}
return -1;
}
    
static int PeakElement(int[] arr){
    int lower = 0;
    int upper = arr.length-1;
    while(lower<upper){
      //  int mid = (lower+upper)/2;
      int mid = lower + (upper-lower)/2;
        if (arr[mid] < arr[mid +1]) {
            lower = mid +1;

        }else{
            upper = mid;

        } 
    }
    return lower;
}
}