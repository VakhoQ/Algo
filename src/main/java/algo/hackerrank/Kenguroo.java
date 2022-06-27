package algo.hackerrank;

public class Kenguroo {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean match=false;
        for(int i=1; i<=10000;i++){
            if(x1+v1*i==x2+v2*i){
                match=true;
                break;
            }
        }
        if(match){
            return "YES";
        }{
            return "NO";
        }
    }

}
