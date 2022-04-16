package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static{//static değişkeni static blok ile tanımladık. tanımlamazsan yine   final static String name; hata verir

        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {// bunu yapmazsan sadece final String birthDay; böyle kalırsa hata verir. tanımlama yapmalısın
        //cons ile nesne oluşturuldugunda bu argument birtday olacak ve bir daha değiştirilemeyecek
        this.birthDay = birthDay;
    }

    public final static void main(String[] args) {

        final double pi = 3.14;

        //pi = 4.14; final variables can not be reassigned
        // pi = 5.4;

        final String name;

        name = "Java";// bir kere tanımlaman gerek ve sadece bir kere sonra değiştirilemez
        //   name = "Wooden Spoon";
        System.out.println(name);

        System.out.println("----------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthDay = "June/01"; // final variables can not be reassigned
        System.out.println(obj.birthDay);


        System.out.println("----------------------------------------");

        //  FinalVariable.name = "Python";  final olmazsa bu şeklide değiştirebilirsin. static değişmez anlamaında değil sadece tek kopyası var her nesne için anlamında

        System.out.println(FinalVariable.name);//statik variable ı sınıf ismi ile cağırabilirsin


    }
}
