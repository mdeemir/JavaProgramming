package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number= 9; // sadece byte, short , int, String, char için kullanılabilir.
        switch (number){ // 1,2,3,4,5,6,7,        == sadece bu karşılaştırma operatorü için kullanılabilir.)
            case 1: // compiler eşleşmenin başladığı npktadan sonra okumaya devam eder break veya } paranteze kadar
                System.out.println("Monday");//boolean, doublei float ve long için kullanılamaz
                break; //exist the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break; // break komutu olmazsa compiler bir sonraki break komutu veya süslü paranteze kadar çalıştırır
            case 3: // iki case değer aynı olamaz hata verir tek olnalı yani case 4: x, case 4: y olamaz
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default: /*enson da olması zorunlu değil ama bu şekilde kullanılması tercih edilir
                 sonda olduğunda break komutuna gerek yok çünkü sonrasında } parantez var
                ama araya yazarsan break komutunu yazmak zorundasın yoksa okumaya devam eder
                sadece bir tane default olabilir. 2 olamaz.
                 */
              System.out.println("Invalid number");
        } // break komutu olmazsa başladığı yerden buraya kadar çalıştırır


    }
}
