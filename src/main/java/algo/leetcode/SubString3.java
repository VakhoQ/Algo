package algo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SubString3 {


    public static void main(String[] args) {

        lengthOfLongestSubstring("abcabca");
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int res =0;

        for(int i=0; i<n; i++){

            for(int j=i; j<n; j++){

                boolean isRepetition = checkRepetition(s, i ,j);

                if(isRepetition){
                    int subLen=j-i+1;
                    if(subLen > res){
                        res = subLen;
                    }
                }
            }
        }

        return -1;
    }

    private static boolean checkRepetition(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if(chars.contains(c)){
                return false;
            }
            chars.add(c);
        }
        return true;
    }
}
