public class RichestCustomerWealth {
  //  https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
      int[][]  accounts ={{1,2,3},{3,2,8}};
      System.out.println(maxnum(accounts));
    }
    static int maxnum(int accounts[][]){
        int ans = Integer.MIN_VALUE;
for (int i = 0; i < accounts.length; i++) {
    
    
int sum= 0;
    for (int j = 0; j < accounts[i].length; j++) {
          sum += accounts[i][j];
    }
    if(ans<sum){
    ans= sum;
}
}
return ans;

    }
}
