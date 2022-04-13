package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.pi;//sadece pi static üyeyi yükledik
//import static day34_GarbageCollection_AccessModifiers.Circle.*; sınıftaki STATİC OLAN bütün üyeleri (değişken metod vs.) yükledik
//avantajı static import yaptıktan sonra bu değişkeni tekrarÇAĞIRMANA gerek yok class boyunca. pi artık değişken olarak tanımlandı
public class StaticImport {

    public static void main(String[] args) {


        System.out.println(pi);


    }
}
