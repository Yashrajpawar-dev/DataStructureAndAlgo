

public class BinarySearchInDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {90,89,76,65,54,49,47,34};

        int key = 89;
        System.out.println(search(arr,key));
    }

static int search(int[] arr, int key){
    int lower = 0;
    int upper = arr.length-1;
    while(lower<=upper){
      //  int mid = (lower+upper)/2;
      int mid = lower + (upper-lower)/2;
        if (arr[mid] == key) {
            return mid;
            
        }else if(key < arr[mid]){
             upper = mid -1;
           
        }else{
            lower = mid + 1;
        }
    }
    return -1;
}
}
