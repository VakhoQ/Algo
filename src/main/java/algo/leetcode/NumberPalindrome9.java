package algo.leetcode;

public class NumberPalindrome9 {

    public static void main(String[] args) {

    }

    class Solution {
        public boolean isPalindrome(int x) {


            char [] arr = Integer.toString(x).toCharArray();

            for(int i=0; i<arr.length; i++){
                int j=arr.length-i-1;
                if(j<=i){
                    return true;
                }
                if(arr[i]!=arr[j]){
                    return false;
                }
            }
            return true;
        }
    }
}
