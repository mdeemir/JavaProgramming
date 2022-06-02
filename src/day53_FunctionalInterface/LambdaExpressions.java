package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        //     <>  içerisine String yazdık. T olarak herhangi bir type olabilirdi. String olsun istedik ve bize string döndürecek
        MyThirdFunctionalInterface<String> stringReverse =
               //s fonksiyonda kullanacağımız tanımlamak için herhangi bir sey olabilir genelde sadece bir harf kullanılır tanımlamak için

                (s) -> {
            // StringBuilder class ı var javada reverse metodu var. tekrar stringe cevirdik.
            String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;// return type T demistik T de String olsun dedik bu nedenle String döndürdük. yazmazsan hata verir
                };

       String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);//noopS nedooW

        //create a function that can return the cube of an integer

        MyThirdFunctionalInterface<Integer>cubeCalculate=
                c->{
            int cube= c*c*c;
            return cube;
                };
        int result2=cubeCalculate.method(5);
        System.out.println("result2 = " + result2);


    }

}
