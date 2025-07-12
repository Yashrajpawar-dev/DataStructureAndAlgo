public class LinearSearchInRange {
    public static void main(String[] args) {
        int arr[] = {768, 997, 293, 471, 120, 414, 987, 13, 598,};
        int key = 768;
        int ans = search(arr,key,2,8);
System.out.println(ans);
    }
    static int   search(int arr[],int key,int index1,int index2){
if ( arr.length == 0){
    return -1;
}
for (int i = index1; i < index2; i++) {
    if (key == arr[i]) {
       return i;
    }
} return - 1;
   }
}
