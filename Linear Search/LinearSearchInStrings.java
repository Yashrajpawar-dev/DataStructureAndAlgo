import java.util.Arrays;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name = "yash";
        char key = 's';
        System.out.println(search(name,key));
         System.out.println(searchTwo(name,key));
         System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search( String str, char key){
        if( str.length() ==  0){
            return false;

        }
        for (int i = 0; i<str.length();i++) {
            if(key == str.charAt(i)){
                return true;
            }
            
        }
        return false;
    }
     static boolean searchTwo( String str, char key){
        if( str.length() ==  0){
            return false;

        }
       for (char i : str.toCharArray()) {
        if (i == key) {
            return true;
            
        }
        
       }
             return false;
        }
       
    }


