public class SumOfTwoArrayt {



    public static void sum(int[] a1, int[] a2, int [] result ) {
        int i = a1.length-1;
        int j = a2.length-1;
        int carry = 0;
        int k = Math.max(a1.length, a2.length);

        while (i >= 0 && j >= 0) {
            int sum = a1[i] + a2[j] + carry;
            result[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        while (i >= 0) {
            int sum = a1[i] + carry;
            result[k]= sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }
        while (j >= 0) {
            int sum = a2[j] + carry;
            result [k]  = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }
        result [0] = carry;
    }
}




