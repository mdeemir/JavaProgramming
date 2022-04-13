package day11_Switch_Scanner;

public class NUmberOfDays {
    public static void main(String[] args) {
        int year=2000;
        int number=2;
        String result="";

        if (number>=1 && number<=12){

            switch (number){
                case 2:
                    result=(year%4==0)? "29 days" : "28 days"; // ternaries kullandık cse içinde if koşulu oluşturdum
                    // artık yılda şubat 29 çekme ihtimali eklendi
                    break;
                case 4: case 6: case 9: case 11: // || (or) bunun switch te kullanımı bu şekilde yapılır
                    result="30 days";
                    break;
                default: // 1,3,5,7,8,10,12
                    result="31 days";

            }

            System.out.println(result);

        } else{
            result="Invalid number";
        }

    }
}
