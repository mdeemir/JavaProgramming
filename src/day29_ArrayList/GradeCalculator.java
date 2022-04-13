package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>( scores ); // 90 ~ 100
        gradeOfA.removeIf( p ->  !(p >= 90 && p <= 100)  );
        System.out.println(gradeOfA);//[100, 90]


        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf( p -> !(p >= 80 && p <= 89)  );
        System.out.println(gradeOfB);//[85, 85]


        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf( p -> !(p >=70 && p <= 79) );
        System.out.println(gradeOfC);//[75, 73, 73]


        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf( p -> !(p >= 60 && p <= 69));
        System.out.println(gradeOfD);//[65]

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);

        System.out.println(gradeOfF);//[55, 45, 35, 47]


        System.out.println("Total number of A: "+gradeOfA.size());//Total number of A: 2
        System.out.println("Total number of B: "+gradeOfB.size());//Total number of B: 2
        System.out.println("Total number of C: "+gradeOfC.size());//Total number of C: 3
        System.out.println("Total number of D: "+gradeOfD.size());//Total number of D: 1
        System.out.println("Total number of F: "+gradeOfF.size());//Total number of F: 4



    }
}
