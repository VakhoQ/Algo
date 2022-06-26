package algo.interviewbit.arrays;

import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

    public static void main(String[] args) {
        List l = Arrays.asList( -2,1,- 3,4,-1,2,1,-5,4);
        System.out.println(new MaxSubArray().maxSubArray(l));
    }

    // Time Complexity O(N^2)
    public int maxSubArray2(final List<Integer> A) {

        int maxSum=A.get(0);
        int index=0;
        while(index<A.size()){
            int sum=0;
            for(int i=index; i<A.size(); i++){
                sum+=A.get(i);
                if(sum > maxSum){
                    maxSum=sum;
                }
            }
            index++;
        }
        return maxSum;
    }


    /*
     Dynamic programming.
     O(N) Time complexity
     */
    public int maxSubArray(final List<Integer> A) {

       int maxSoFar = A.get(0);
       int maxEndingHere=A.get(0);

       for(int i=1; i<A.size(); i++){

           maxEndingHere =  Math.max(A.get(i), A.get(i) + maxEndingHere);
           maxSoFar = Math.max(maxEndingHere, maxSoFar);

       }

       return maxSoFar;
    }

}
