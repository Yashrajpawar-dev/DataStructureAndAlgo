import java.lang.reflect.Array;
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
int[] roll_no;
roll_no = new int[5];

// roll_no[0] = 1000;
// roll_no[1] = 9000;
// roll_no[2] = 7000;
// roll_no[3] = 5000;
// roll_no[4] = 67000;
//[1000,9000,7000,5000,67000]allocated inside the memory
// System.out.println(roll_no[3]);

// Input using for loop
for(int i=0;i<5;i++){
    roll_no[i]= scanner.nextInt();
}
for(int i = 0; i<5;i++){
System.out.println(roll_no[i] + " ");
}
for( int i : roll_no){ // for every element in array, print the element
    System.out.println(i);// here num represent elemet of the arrauy
}

//System.out.println(roll_no[5]);// index out of boumd error

System.out.println(Arrays.toString(roll_no));

//arrray of objects

String[] str = new String[5];
for (String string : str) {
  string = scanner.next();
    
}

}
}
