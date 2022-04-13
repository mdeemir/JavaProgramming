package day10_NestedIf;
// nested if bloklrında ternaries tavsiye edilmez çünkü okuması zor kodu
public class GradeReport2 {
    public static void main(String[] args) {
        /*
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

         */
        int score=85;

        String result=(score>=0 && score<=100)? (score>=90)? "Excellent" :(score>=80)? "Great"
                :(score>=70)? "Good" :(score>=60)? "Passed" : "Failed" :"Invalid Score";

        System.out.println(result);
    }

    /*
    if blokları ve ternaries i beraber kullanabilirsin bu da başka bir çözüm
        // solution3:
        String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

           result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2);
     */




}
