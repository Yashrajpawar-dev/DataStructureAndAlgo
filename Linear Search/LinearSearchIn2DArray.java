import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {67,89,90},
            {96,43,12},
            {60,70,32},
        };

        int key = 12;
        int[] ans = search(arr,key);
        System.out.println(Arrays.toString(ans));
    }
    static int[]   search(int arr[][],int key){
if ( arr.length == 0){
 return new int[]{-1,-1};
}
for (int i = 0; i < arr.length; i++) {
   for(int j = 0;j<arr[i].length;j++){
    if(arr[i][j] == key){
        return new int[]{i,j};
    }
   } 
   }
   return new int[]{-1,-1};
}

}
