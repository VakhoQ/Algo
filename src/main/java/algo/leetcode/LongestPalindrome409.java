package algo.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome409 {


    public static void main(String[] args) {

    }

    class Solution2 {
        public int longestPalindrome(String s) {

            int matched=0;
            Set<Character> unmached = new HashSet<Character>();
            for (char c: s.toCharArray()) {
                if(!unmached.contains(c)){
                    unmached.add(c);
                }else{
                    matched++;
                    unmached.remove(c);
                }
            }
            int longestPalindromeLength = matched * 2;
            if(unmached.size() > 0){
                longestPalindromeLength++;
            }
            return longestPalindromeLength;
        }
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
