import java.util.Arrays;

public class Methods {
public static void additionOfTwoNums(int a , int b){
    int sum = a+b;
    System.out.println(sum);
}
    public static void main(String[] args) {
        additionOfTwoNums(8,9);
        String name = "yash";
        changeName(name);
        System.out.println(name);/*  name will not change
                                     it will create an obj
                                     it is passed by reference 
 
 
*/

int arr[] = {4,6,7,64};
changeArrayElement(arr);// it will change because it passed by value
System.out.println(Arrays.toString(arr));
    }
   static void changeName(String naam){
    naam  = "satyajeet";
   }
  static void changeArrayElement( int num[]){
num[3]=67;
  }

}

/*
 * Function basically have return type in which it return the returntype
 */

