public class MinimumUsingLinearSearch {
    public static void main(String[] args) {
         int arr[] = {768, 997, 293, 471, 1, 414, 987, 13, 598,};
         System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1 ; i<arr.length;i++)
{
    if(min>arr[i]){
        min = arr[i];
    }
}   return min;
 }
}
