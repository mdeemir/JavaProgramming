package day53_FunctionalInterface;

@FunctionalInterface //bu yazmalısın önce
public interface MyThirdFunctionalInterface<T> {
//herhangi bir isim olabilir ama "T" type temssil ettiği için kullaılır
     //abstract bir metod oluşturmazsan hata verir. abstract metod oluşturmak zorundasın

     //en baştaki T return type gösteriyor. burada return type ı T olmasını istiyoruz (voiid veya string doble int değil). T primitive veya non primitive olabilir
     //isim de generic olmalı. method dedik. () içine de generic type yazdık veri tipi de T olsun istedik.
     //access modifier ı public oldu. defaukt olarak abstract metod.
     T method(T data);

}

/*
2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes
one argument of any type and returns the same type
 */