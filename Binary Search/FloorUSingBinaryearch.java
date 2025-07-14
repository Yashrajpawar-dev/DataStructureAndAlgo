public class FloorUSingBinaryearch {
     public static void main(String[] args) {
        int[] arr = {2,4,5,11,14,16,20,23,29,30};

        int key = 19;
        System.out.println(search(arr,key));
    }
//return the index of greatest no <= target
static int search(int[] arr, int key){
  
    int lower = 0;
    int upper = arr.length-1;
    while(lower<=upper){
      //  int mid = (lower+upper)/2;
      int mid = lower + (upper-lower)/2;
        if (arr[mid] == key) {
            return mid;

        }else if(key > arr[mid]){
            lower = mid + 1;
        }else{
            upper = mid -1;
        }
    }
    return upper;
}
}
