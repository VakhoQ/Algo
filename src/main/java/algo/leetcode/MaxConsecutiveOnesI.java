package algo.leetcode;

public class MaxConsecutiveOnesI {

    public static void main(String[] args) {

        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxSoFar=0;
        int max=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]==1){
                max++;
            } else{
                maxSoFar=Math.max(maxSoFar, max);
                max=0;
            }
        }

        return Math.max(maxSoFar, max);

    }
}
