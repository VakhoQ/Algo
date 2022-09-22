package algo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString205 {

    public static void main(String[] args) {
       boolean result = new Solution().isIsomorphic("bar", "foo");
        System.out.println(result);
    }

    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            if(s.equalsIgnoreCase(t)){
                return true;
            }
            Map<String, String> map = new HashMap<>(s.length());
            for(int i=0; i<s.length(); i++){
                String sCh = ((Character) (s.charAt(i))).toString();
                String tCh = ((Character) (t.charAt(i))).toString();
                if(!map.containsKey(sCh)){
                    map.put(sCh,tCh );
                }else {
                    if( !map.get(sCh).equalsIgnoreCase(tCh)){
                        return false;
                    }

                }
            }
            map = new HashMap<>(s.length());
            for(int i=0; i<s.length(); i++){
                String sCh = ((Character) (t.charAt(i))).toString();
                String tCh = ((Character) (s.charAt(i))).toString();
                if(!map.containsKey(sCh)){
                    map.put(sCh,tCh );
                }else {
                    if( !map.get(sCh).equalsIgnoreCase(tCh)){
                        return false;
                    }
                }
            }
            return true;
        }
    }

}


