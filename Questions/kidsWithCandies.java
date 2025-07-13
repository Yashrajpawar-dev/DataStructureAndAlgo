package Questions;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class kidsWithCandies{
    public static void main(String[] args) {
         int[] candies = {2,3,5,1,3};
    int extraCandies = 3;
  System.out.println(kidsWithCandie(candies, extraCandies));
}
 public static List<Boolean> kidsWithCandie(int[] candies, int extraCandies) {
List<Boolean> result = new ArrayList<>();
int max = 0;

for (int i = 0 ;i<candies.length;i++){
    if (max<candies[i]){
        max = candies[i];
    }
}

for (int i = 0; i < candies.length; i++) {
    result.add(candies[i]+extraCandies >= max);
    
}
return result;
}

}
