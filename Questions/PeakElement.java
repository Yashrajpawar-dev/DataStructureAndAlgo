package Questions;
//https://leetcode.com/problems/find-peak-element/description/
public class PeakElement{
    public static void main(String[] args) {
        int[] arr = {2,4,5,11,6,4,3,2};

       
        System.out.println(search(arr));
    }

static int search(int[] arr){
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