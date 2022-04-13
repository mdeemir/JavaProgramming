package extraPackageToShowImport;

import week09.Calculator;

public class CalculatorTest2 {
    public static void main(String[] args) {

//farklı package dan metod çağırıyorsan import etmelisin veya otomatik import ayarlaman lazım
        //aynı package içinde farklı class tan çağısıyorsan importa gerek yok
        System.out.println("Calculator.add(3.0,4.5) = " + Calculator.add(3.0, 4.5));

    }
}
