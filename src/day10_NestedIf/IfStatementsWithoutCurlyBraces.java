package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {
        int number=11;
        String result=""; // "" bu şekilde bir değer ata başta yoksa sonra hata verebilir

        if(number>=1 &&number<=12) // if the number is valid
            if(number==1) // sadece bir durum çalışacaksa süslü parantez koymana gerek yok ama birden fazla komut vereceksen yazmalısın
                result="January";
            else if (number==2)// mesela result="February"; + System.out.print("Şubatı çok severim"); komutuda çalışacaksa mutlaka süslü parantez kullanılmalı
                result="February";
            else if (number==3)
                result="MaArch";
            else if (number==4)
                result="April";
            else if (number==5)
                result="May";
            else if (number==6)
                result="June";
            else if (number==7)
                result="July";
            else if (number==8)
                result="August";
            else if (number==9)
                result="September";
            else if (number==10)
                result="Oktober";
            else if (number==11)
                result="November";
            else
                result="December";

        else  // if the number is not valid
            result="Invalid";


        System.out.println(result);

    }
}
