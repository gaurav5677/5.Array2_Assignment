//You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by
// some number 'K' in the right hand direction.
//        Your task is to write a function that returns the value of 'K', that means, the index from which the
//        array/list has been rotated.
public class CheckArrayRotation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 1};
        int ch = rotation(arr);
        System.out.println(ch);
    }


    public static int rotation(int[] arr) {
//        int count = 0;//set count to zero
//        for( int i = 0 ; i<arr.length-1 ;i++){
//            if( arr[i]>arr[i+1]){// this will check whether ith element is larger than i+1th element
//                count=i+1;//if yes then increment the counter by i+1
//                break;// and break
//            }
//
//        }
//
//
//
//
//        int min = arr[0] ;
//        int min_index;
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//                min_index = i;
//            }
//        }
//        return min_index;//return counter.



        for( int i = 0 ; i< arr.length;i++){
            if(arr[i]>arr[i+1])
                return (i+1);
        }
    return 0;
    }

}
