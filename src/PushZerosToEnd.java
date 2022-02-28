public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 3, 4, 0, 0, 0, 4};
        pushZerostoEnd(arr);
        printArray(arr);
    }

    public static void pushZerostoEnd(int[] arr) {
        int k = 0; //sorted array Index , it will update only when nonzero element found ..
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {// here we are checking whether the next num is zero or not
                //if it is non zero then we well replace it with the temp variable and
                // we will increment i but not the k ,  k will  increment when  non zero element is found
                int temp  = arr[i];
                arr[i] = arr[k]; //arr{i}= arr{nonzero}
                arr[k] = temp;//arr{nonzero}=temp;
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

