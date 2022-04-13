package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
       /*
       90 - 100: excellent
       80 - 89: Great
       70 - 79: Good
       60 - 69: Passed
       0 - 59: failed
       */

        int score=135;

        if (score>=0 && score<=100){ // if the score is valid
            // 5 possibilities
            if (score>=90){ // false: score < 90 - score>=80 && score <=90 yazmaya gerek yok sonraki satırda çünkü false durumu zaten score <90 için geçerli
                System.out.println("Excellent");
            }else if (score>=80){ // false: score<80
                System.out.println("Great");
            }else if (score>=70){// false score<70
                System.out.println("Good");
            }else if (score>=60){// false score<60
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        } else { // if the score is not valid
            System.out.println("Invalid score");
        }

        System.out.println("-------------------------------");
        
        String result=""; // böyle durumlarda "" olrak tanımla yoksa result tanıumlanmadığı için hata verir compiler

        if (score>=0 && score<=100){ // if the score is valid
            // 5 possibilities
            if (score>=90){ // false: score < 90 - score>=80 && score <=90 yazmaya gerek yok sonraki satırda çünkü false durumu zaten score <90 için geçerli
                result="Excellent";
            }else if (score>=80){ // false: score<80
                result="Great";
            }else if (score>=70){// false score<70
                result="Good";
            }else if (score>=60){// false score<60
                result="Passed";
            }else {
               result="Failed";
            }
        } else { // if the score is not valid
           result="Invalid score";
        }
        System.out.println("result = " + result);

    }
}
