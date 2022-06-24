package algo.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Staircase {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Staircase.staircase(n);

        bufferedReader.close();
    }

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {

        for(int i=1; i<=n; i++){
            print(i, n);
        }

    }
    public static void print(int i, int max){
        int spaces = max -i;
        for(int j=0; j<spaces; j ++){
            System.out.print(" ");
        }
        for(int k=0; k<i; k++){
            System.out.print("#");
        }
        System.out.println();
    }

}

