package algo.geeksforgeeks;

public class Flip {

    /**
     * https://practice.geeksforgeeks.org/problems/flip-bits0240/1
     * @param args
     */
    public static void main(String[] args) {

        int [] arr =new int[]{1, 0, 0, 1, 0, 0, 1};
        maxOnes(arr,arr.length);
    }

    // O(N^2)
    public static int maxOnes(int a[], int n) {

        int maxDiff =0;

        int l=0; int r=0;
        int ones=0;

        for(int i=0; i<n; i++){

            int count1 = 0, count0 = 0;
            for(int j=i; j<n; j++){
                if(a[j] == 0)  count0++;
                else count1++;

                if(maxDiff < count0-count1){
                    maxDiff = count0-count1;
                    l=i; r=j;
                }
            }


        }

        for(int i=0; i<l; i++) {
            if(a[i]==1){
                ones++;
            }
        }

        for(int i=l; i<n; i++) {
            if(a[i]==1){
                ones++;
            }
        }

        return ones+maxDiff;
    }

}
