package algo.geeksforgeeks;

public class Flip {

    /**
     * https://practice.geeksforgeeks.org/problems/flip-bits0240/1
     *
     * @param args
     */
    public static void main(String[] args) {

        // int [] arr =new int[]{1, 0, 0, 1, 0, 0, 1};
        int[] arr = new int[]{1, 0, 1, 0, 1, 0, 0, 1, 1};

        //
        maxOnes(arr, arr.length);
    }

    // O(N^2)
    public static int maxOnes2(int a[], int n) {

        int maxDiff = 0;

        int l = 0;
        int r = 0;

        int originalOnes = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) originalOnes++;

            int count1 = 0, count0 = 0;
            for (int j = i; j < n; j++) {
                if (a[j] == 0) count0++;
                else count1++;

                if (maxDiff < count0 - count1) {
                    maxDiff = count0 - count1;
                    l = i;
                    r = j;
                }
            }


        }


        return originalOnes + maxDiff;
    }


    public static int maxOnes(int a[], int n) {


        int originalOnes = 0;
        int maxSoFar = 0;
        int maxEndingHere = 0;


        for (int i = 0; i < n; i++) {
            if (a[i] == 1) originalOnes++;

            int val = (a[i] == 0) ? 1 : -1;

            maxEndingHere = Math.max(val, val + maxEndingHere);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);

        }
        maxSoFar = Math.max(0, maxSoFar);

        return originalOnes + maxSoFar;
    }


}
