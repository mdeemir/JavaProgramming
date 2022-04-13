package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        /*
        int score=150;

        if (score>=0 && score<=100) { //if the score is valid

            if (score>=60){ //if the student passed the exam
                System.out.println("Passed");
            }else { //if the student failed exam
                System.out.println("Failed");
            }

        } else { // if the score is not valid
            System.out.println("Invalid score");
        }
        //yine hepsi aynı data tipinde
 */
        int score= 85;
        String result=(score>=0 && score<=100)? (score>=60)? "Passed" : "Failed" :"Invalid Score";
        // iç içe if te birinci soru işaretinden sonra ikinci ...üçüncü ... soru işareti sırayla aynı kurallarla devam et
        System.out.println(result);

    }
}
