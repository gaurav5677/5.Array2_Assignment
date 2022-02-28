
//    You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
//Sample Input 1:

//1 2 3 4 5 6 7
//2
//Sample Output 1:
//3 4 5 6 7 1 2
public class Rotate_array {


    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 11, 12, 17};
        int x = 4;
        Rotate(arr, x);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapElement(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void revers(int[] arr, int start, int end) {

      while(start < end ){
          swapElement(arr,start,end);
          start++;
          end--;
        }
    }

    public static  void Rotate(int[] arr, int x) {


    x = x % arr.length;
if (x <0) {
x =x+ arr.length;
}


        //part 1
        revers(arr, 0, arr.length  - 1);
//        part 2
        revers(arr, 0, arr.length-1 - x);
//        part 3
        revers(arr, arr.length-x, arr.length - 1);


    }

}
