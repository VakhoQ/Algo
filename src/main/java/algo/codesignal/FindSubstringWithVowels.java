package algo.codesignal;


public class FindSubstringWithVowels {
    public static void main(String[] args) {
        System.out.println(solution("010", "amazing"));
    }
    public static int solution(String pattern, String source) {
        int count=0;
        String vowels = "aieouy";
        for(int i=0; i<source.length(); i++){
            boolean found=false;
            for(int j=0; j<pattern.length(); j++){
                if(i+pattern.length()>source.length()){
                    break;
                }
                String c=String.valueOf(source.charAt(i+j));
                String p = String.valueOf(pattern.charAt(j));
                if((p.equalsIgnoreCase("0") && vowels.contains(c.toLowerCase())) || (p.equalsIgnoreCase("1") && !vowels.contains(c.toLowerCase()))){
                    found=true;

                }
                else{
                    found=false;
                    break;
                }
            }
            System.out.println("");
            if(found){
                count++;
            }

        }
        return count;
    }

}
