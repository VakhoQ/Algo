package algo.leetcode;

public class SubSequence392 {

    public static void main(String[] args) {




        System.out.println(new SubSequence392().isSubsequence("abc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {


        int index=0;
        for(int i=0; i<s.length(); i++){
            String ch_i = ((Character)s.charAt(i)).toString();
            boolean found=false;

            while(index!=t.length()){
                Character ch =t.charAt(index);
                if(ch==null){ break; }
                String ch_j = ch.toString();
                if(ch_j.equalsIgnoreCase(ch_i)){
                    found=true;
                    index++;
                    break;
                }
                index++;
            }

            if(!found){
                return false;
            }

        }
        return true;

    }
}
