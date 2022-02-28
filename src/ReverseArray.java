public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        revers(arr);//called for reversing the array
        printArray(arr);//this will print out reversed array
    }

    public static void printArray(int[] arr) {//funtion for Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void revers(int[] arr) {//funtion for the reversing the array
        int i = 0;// i will start from the 0th element
        int j = arr.length - 1;//and the  j will start from the last elememt (n-1)
        while (i < j) {//loop will run till the  i or j , cross each other
            int temp = arr[i];// stored the value of i in temp
            arr[i]=arr[j];// here i  copyed the value of j
            arr[j]=temp;// and j become i
            i++;// i will be increased
            j--;// and j will be decreased
        }

    }
}
