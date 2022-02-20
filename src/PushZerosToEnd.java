public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 3, 4, 0, 0, 0, 4};
        pushZerostoEnd(arr);
        printArray(arr);
    }

    public static void pushZerostoEnd(int[] arr) {
        int k = 0; //sorted array Index , it will update only when nonzero element found ..
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }

        public static void printArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }



}

