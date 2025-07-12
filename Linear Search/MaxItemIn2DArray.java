public class MaxItemIn2DArray {
    public static void main(String[] args) {
         int[][] arr = {
            {67,89,90},
            {96,43,12},
            {60,70,32},
        };

       System.out.println(max(arr));
    }
     static int  max(int arr[][]){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
   for(int j = 0;j<arr[i].length;j++){
    if (max<arr[i][j]) {
        max = arr[i][j];
        
    }
   }}
return max;
     
}
}