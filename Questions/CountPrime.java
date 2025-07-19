package Questions;
// https://leetcode.com/problems/count-primes/description/
public class CountPrime {
    

 public static void main(String[] args) {
       int num = 5000000; 
 System.out.println(solution(num));
 }
 static int solution(int n){
 if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
 
 static boolean isPrime(int num){
if ( num <= 1) {
    return false;
    
}
for(int i = 2; i<= Math.sqrt(num);i++){
    if(num % i == 0){
return false;
  
} 
}
return true;
 }
 }

