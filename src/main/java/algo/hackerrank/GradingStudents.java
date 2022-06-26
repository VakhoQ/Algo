package algo.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {


    public static List<Integer> gradingStudents(List<Integer> grades) {


        List<Integer> result = new ArrayList<>();
        for(int i=0; i<grades.size(); i++){
            int j=2;
            boolean added = false;
            while(j>0){
                if((grades.get(i)+j) % 5 ==0){
                    if(grades.get(i)+j >=40){
                        result.add(grades.get(i)+j);
                    }else{
                        result.add(grades.get(i));
                    }
                    added=true;
                    break;
                }
                j--;
            }
            if(!added){
                result.add(grades.get(i));
            }
        }
        return result;
    }


}
