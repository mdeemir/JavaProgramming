package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) // parantez< yok dikkat
            System.out.println("Cydeo");
          //System.out.println("Batch 25");  bu şekilde olsaydı sadece cydeo tekrar ederdi + bir kezbatch 25 yazardı
        for (int i = 0; i < 5; i++) {
            System.out.println("Batch 25");
        }




    }
}
