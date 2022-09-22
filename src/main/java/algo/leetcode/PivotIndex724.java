package algo.leetcode;

public class PivotIndex724 {
}
class Solution {
    public int pivotIndex(int[] nums) {

        long [] a = new long [nums.length];
        long [] b = new long [nums.length];

        long count =0;

        if(nums.length==1){
            return nums[0];
        }

        for(int i=0; i<nums.length; i++){
            count+=nums[i];
            a[i]=count;
        }

        count=0;
        for(int i=nums.length-1; i>=0; i--){
            count+=nums[i];
            b[i]+=count;
        }

        long left=-1;
        long right=-1;

        for(int i=0; i<nums.length; i++){

            if(i==0){
                left=0;
                right=b[i+1] ;
            } else if(i==nums.length-1){
                right=0;
                left=a[i-1];
            } else{
                left=a[i-1];
                right=b[i+1];
            }

            if(left==right){
                return i;
            }


        }
        return -1;
    }
}