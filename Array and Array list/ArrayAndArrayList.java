
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndArrayList {
    public static void main(String[] args) {
    
// Q: store a roll no
//     int rollno = 5;

//     // Q: store a persons name
//     String name = "yash";

//     // Q: store 5 roll numbers
//     int rollno1 = 29;
//     int rollno2 = 61;
//     int rollno3 = 44;

//     //Syntax
//     // datatype[] variable_name = new datatype[size];
//    // store 5 Roll no
//    int[] rollNo = new int[5];
//    // or directly
//    int[] roll_no = {56,67,8 ,9,8};

//    //declaration
//    int root[];
// //Actual memoery allocation
// root = new int[5];

// int[] roll_no;// it basically got defined into the stack 
// roll_no = new int[5];//it initializes and actually object is created in heap memory


// System.out.println(roll_no[5]);

// String[] arr = new String[5];
// System.out.println(arr[0]); // By default Null

Scanner scanner = new Scanner(System.in);
// int[] roll_no;
// roll_no = new int[5];

// roll_no[0] = 1000;
// roll_no[1] = 9000;
// roll_no[2] = 7000;
// roll_no[3] = 5000;
// roll_no[4] = 67000;
//[1000,9000,7000,5000,67000]allocated inside the memory
// System.out.println(roll_no[3]);

// Input using for loop
//for(int i=0;i<5;i++){
 //   roll_no[i]= scanner.nextInt();
//}
//for(int i = 0; i<5;i++){
//System.out.println(roll_no[i] + " ");
//}
//for( int i : roll_no){ // for every element in array, print the element
  //  System.out.println(i);// here num represent elemet of the arrauy
//}

//System.out.println(roll_no[5]);// index out of boumd error

//System.out.println(Arrays.toString(roll_no));

//arrray of objects

/*String[] str = new String[5];
for (String string : str) {
  string = scanner.next();
    
}*/

// modify
//str[0]= "yash";
//System.out.println(str);



//  2D array

/*
  1 2 3 
  4 5 6
  7 8 9 
 */
//int[][] num = new int[3][];// rows are mandatory and columns are not.

//int[][] arr2d = {
//  {4, 5, 6},
//  {4},
//   {4, 5}
//     };

    //input

//     int[][] arra = new int[3][3];
//     for(int row = 0; row < arra.length;row++){
//  for (int col = 0; col < arra[row].length;col++){
// arra[row][col] = scanner.nextInt();
//  }
//     }


//     for(int row = 0; row < arra.length;row++){
//  for (int col = 0; col < arra[row].length;col++){
// System.out.print(arra[row][col] + " " );
//  }
//  System.out.println();
//     }
// for (int[] is : arra) {

//   System.out.println(Arrays.toString(is));
// }



// Example

// int[][] new1 = {
//   {1, 2, 3},
//   {4, 5},
//   {8, 9, 10}
// };

// for(int row = 0; row< new1.length;row++){
//   for(int col = 0; col< new1[row].length;col++){
// System.out.print(new1[row][col] + " ");
//   }
// System.out.println();
// }

// Array List

// ArrayList<Integer> list = new ArrayList<>();// Part of colllection framework

// list.add(45);
// list.add(45);
// list.add(45);
// list.add(45);
// list.add(45);
// list.add(45);
// list.add(45);
// list.add(45);


// System.out.println(list.contains(45));
// System.out.println(list);
// list.set(3, 18);
// list.remove(4);
// System.out.println(list);

// for (int i =0 ; i< 5; i++){
//   list.add(scanner.nextInt());
// }
// for (int i =0 ; i< 5; i++){
// System.out.println(list.get(i));}



// Multidimensional array of arraylist
// ArrayList<ArrayList<Integer>> list = new ArrayList<>();

// // Initializtion
// for (int i = 0; i < 3; i++) {
//   list.add(new ArrayList<>());
  
// }

// for (int i = 0; i < 3; i++) {
//   for(int j = 0; j < 3; j++)
//   list.get(i).add(scanner.nextInt());
// }
// System.out.println(list);


//  swap 

// int[] num = {23, 45,67,12};

// swap(num, 0 , 3);
// System.out.println(Arrays.toString(num));



//  Max Number
int arr[] = {45, 67,890,67,34,56,78,19};

System.out.println(max(arr));
System.out.println(maxRange(arr, 03, 7));

reverArray(arr);
System.out.println(Arrays.toString(arr));
scanner.close();
}
static void swap(int[] num, int index1, int index2){
  int temp = num[index1];
num[index1]= num[index2];
num[index2]= temp;
}
static int max(int arr[] ){
  int max = arr[0];

  for(int i = 0;i<arr.length;i++){

    if (max < arr[i]){
      max= arr[i];
    }
  } return max;
}
static int maxRange(int arr[], int start,int end ){// Work on edge cases
  int max = arr[start];

  for(int i = start;i<end;i++){

    if (max < arr[i]){
      max= arr[i];
    }
  } return max;
}
static void reverArray(int arr[]){
  int start = 0;
  int end = arr.length-1;
  while (start<end) {
    
  
  swap(arr, start,end);
  start++;
  end--;
  }

}

}
