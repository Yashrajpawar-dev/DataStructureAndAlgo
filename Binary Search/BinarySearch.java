
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,11,14,16,20,23,29,30};

        int key = 23;
        System.out.println(search(arr,key));
    }

static int search(int[] arr, int key){
    int lower = 0;
    int upper = arr.length-1;
    while(lower<=upper){
        int mid = (lower+upper)/2;
        if (arr[mid] == key) {
            return mid;
            
        }else if(key > arr[mid]){
            lower = mid + 1;
        }else{
            upper = mid -1;
        }
    }
    return -1;
}
}

