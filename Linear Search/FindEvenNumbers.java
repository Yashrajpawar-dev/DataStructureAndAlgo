import java.util.Arrays;

public class FindEvenNumbers {

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void main(String[] args) {
        
         int arr[] = {768, 997, 293, 471, 120, 414, 987, 13, 5988,};
         System.out.println(solution(arr));
    } 
    
    static int solution(int[] arr){
  

         int count = 0;

         for(int i = 0 ; i< arr.length;i++){
            if(even(arr[i])){
                count++;
            }
         }
         return count;

        
        }

static boolean even(int num){
    int number = digits(num);
   
        return number % 2 ==0;
        
    

}
static int digits(int num){
    int count = 0; //  to check the number is even or odd
if(num<0){
    num = num + -1;
}
if(num==0){
  return 1;
}
   while(num>0){
    count++;
    num = num/10;

   }
return count;
}
}
