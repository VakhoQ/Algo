package algo.leetcode;

public class RotateMatrix48 {

    public static void main(String[] args) {


        int[][] matrix = new int[][]{
            { 11, 12, 13, 14},
            { 21, 22, 23, 24},
            { 31, 32, 33, 34},
            { 41, 42, 43, 44},
        };

        int len = matrix[0].length;


        for(int i=0; i<len; i++) {

            for (int j = 0; j < len; j++) {

                System.out.print(i + "," + j + " | ");

            }
            System.out.println();
        }

        System.out.println();


        int[][] m2= new int[len][len];

        for(int i=0; i<len; i++) {

            for (int j = 0; j < len; j++) {

                System.out.print(matrix[i][j] + " | ");

            }
            System.out.println();
        }
        System.out.println();

        for(int i=0; i<len; i++){

            for(int j=0; j<len; j++){

                int tmp = matrix[i][j];

                int ni=len-j-1;
                int nj=i;
                System.out.print(ni + "," + nj + " | ");


                m2[i][j]  = matrix[ni][nj];


            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<len; i++) {

            for (int j = 0; j < len; j++) {

                System.out.print(m2[i][j] + " | ");

            }
            System.out.println();
        }

        System.out.println();



    }

    public void rotate(int[][] matrix) {

        int len = matrix[0].length;
        int[][] m2= new int[len][len];

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                int ni=len-j-1;
                int nj=i;
                m2[i][j]  = matrix[ni][nj];
            }

        }

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                matrix[i][j]  = m2[i][j];
            }
        }

    }

}
