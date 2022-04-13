package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;// .* bütün static değişkenleri-metodları yükledi
//import static day34_GarbageCollection_AccessModifiers.Circle.*; sınıftaki STATİC OLAN bütün üyeleri yükledik
// static import yaptıktan sonra bu değişkenleri tekrarÇAĞIRMANA gerek yok class boyunca. değişkenler artık değişken olarak tanımlandı
import static utilities.MathUtility.*;//utilities ssınıfında mathutility sınıfındaki bütün static değişken-metodları yükledik

public class Test {
    public static void main(String[] args) {
// circle sınıfını yüklediğinde (import) static bloktaki değişkenler de yüklenir otomatik olarak
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("----------------------------");

        // find the sum of 10, 20
        int r1 = sum(10, 20);
//import static utilities.MathUtility.*; bunu yaptığımız için doğrudan sum metodunu yazıp kullandık yani sınıf ismini yaızp çağırmadık
        // find the sum of 100, 200
        int r2 = sum(100, 200);


        int r3 = subtract(100,50);

        int r4 = max(1000, 2000);


    }
}
