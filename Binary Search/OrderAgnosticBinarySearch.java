

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
         int[] arr = {90,89,76,65,54,49,47,34};
//   int[] arr = {2,4,5,11,14,16,20,23,29,30,89};

        int key = 89;
        System.out.println(search(arr,key));
    }
    static int search(int arr[], int key)
{
    int start = 0;
    int end = arr.length-1;
    
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
}

