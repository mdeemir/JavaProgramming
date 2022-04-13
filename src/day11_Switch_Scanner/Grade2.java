package day11_Switch_Scanner;

public class Grade2 { // boolean senaryo sadece bu şekilde yapılır. a,b,c,d aldığında geçti, f aldığında kaldı yazdırmak için
    public static void main(String[] args) {
        char ch='A';
        String result="";
        switch (ch){
            case 'A': case 'B': case 'C': case 'D': // bu şekildede yazılabilir
                // bu durumda 'A' case den sonra break veya } parantez görene kadar okumaya devam eder
                result="Passed"; // passed yazdırır en sonda
                break;

            case 'F':
                result="Failed";
            default:
                result="Invalid";

        }
        System.out.println(result);
    }
}
