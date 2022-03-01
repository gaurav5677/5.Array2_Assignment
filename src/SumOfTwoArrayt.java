import java.util.Scanner;

public class SumOfTwoArrayt {
    //    approach 1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.println(c );

        } for ( int val :sum){
            System.out.print(val);//this will directly print the values instead of the positon
        }


    }
}
/////Approch 2
//
//    public static void sum(int[] a1, int[] a2, int [] result ) {
//        int i = a1.length-1;
//        int j = a2.length-1;
//        int carry = 0;
//        int k = Math.max(a1.length, a2.length);
//
//        while (i >= 0 && j >= 0) {
//            int sum = a1[i] + a2[j] + carry;
//            result[k] = sum % 10;
//            carry = sum / 10;
//            i--;
//            j--;
//            k--;
//        }
//        while (i >= 0) {
//            int sum = a1[i] + carry;
//            result[k]= sum % 10;
//            carry = sum / 10;
//            i--;
//            k--;
//        }
//        while (j >= 0) {
//            int sum = a2[j] + carry;
//            result [k]  = sum % 10;
//            carry = sum / 10;
//            j--;
//            k--;
//        }
//        result [0] = carry;
//    }
//}
//



