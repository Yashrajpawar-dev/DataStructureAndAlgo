package Questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};

    char key = 'j';
    
System.out.println(  nextGreatestLetter(arr,key));
    }
static char nextGreatestLetter(char[] arr, char key) {
         int lower = 0;
    int upper = arr.length-1;
    while(lower<=upper){
      //  int mid = (lower+upper)/2;
      int mid = lower + (upper-lower)/2;
        if(key >= arr[mid]){
            lower = mid + 1;
        }else{
            upper = mid -1;
        }
    }
    return arr[lower % arr.length ];
    }
    }

