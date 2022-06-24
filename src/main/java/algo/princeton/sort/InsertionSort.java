package algo.princeton.sort;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

        Integer [] arr = {3,2,1,5,6};

        new InsertionSort().sort(arr);

        Arrays.stream(arr).forEach(e-> System.out.println(e));
    }

    public void sort(Comparable [] a){
        for(int i=0; i<a.length; i++){
            for(int j=i; j>0; j--){
                if(less(a[j], a[j-1])){
                    exchange(a, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    private static boolean less(Comparable i, Comparable j) {
        if (i.compareTo(j) < 0) {
            return true;
        } else {
            return false;
        }
    }

    private void exchange(Comparable [] a, int i, int j){
        Comparable temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
