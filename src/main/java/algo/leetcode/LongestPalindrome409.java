package algo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {


    public static void main(String[] args) {

    }
    class Solution {
        public int longestPalindrome(String s) {

            int longestPalindromeLength = 0;

            Map<Character, Integer> characterToCount = new HashMap<>();
            for(char c : s.toCharArray()){
                if(characterToCount.containsKey(c)){
                    characterToCount.put(c, characterToCount.get(c)+1);
                }else{
                    characterToCount.put(c,1);
                }
            }

            char mostFrequentOddChar = 0;
            int mostFrequentOddCharFrequency = 0;

            for (Map.Entry<Character, Integer> entry : characterToCount.entrySet()) {

                char c = entry.getKey();
                int count = entry.getValue();

                if(count %2 ==0){
                    longestPalindromeLength+=count;
                }else{
                    if(count> mostFrequentOddCharFrequency){
                        mostFrequentOddChar = c;
                        mostFrequentOddCharFrequency = count;
                    }

                }
            }

            longestPalindromeLength += mostFrequentOddCharFrequency;


            if(mostFrequentOddCharFrequency > 0){

                for (Map.Entry<Character, Integer> entry : characterToCount.entrySet()) {

                    if(entry.getKey().equals(mostFrequentOddChar)){
                        continue;
                    }

                    char c = entry.getKey();
                    int count = entry.getValue();

                    if (count%2 != 0) {


                        longestPalindromeLength+=(count-1);
                    }


                }

            }

            return longestPalindromeLength;
        }
    }
}
