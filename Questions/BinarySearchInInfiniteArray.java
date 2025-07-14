
package Questions;

public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 11, 14, 16, 20, 23, 29, 30 };

        int key = 11;
        System.out.println(ans(arr, key));
    }

    static int ans(int[] arr, int key) {
        int start = 0;
        int end = 1;

        while (key > arr[end]) {
            int newStart = end + 1;
            int newEnd = end + (start - end + 1) * 2;
            start = newStart;
            end = newEnd;

        }
        return search(arr, key, start, end);
    }

    static int search(int[] arr, int key, int start, int end) {

        while (start <= end) {
            // int mid = (lower+upper)/2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;

            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
