package day43_Abstraction.car;

public final class Honda extends Car  {
/*burada  public  class Honda extends Car yazarsam hata verir çünkü henüz parent class taki abstract metod için bir body oluşturmadık.
yani metodu tamamlamadık. orada body yoktu. body oluşturdugunda hata kalkıyor.
public abstract class Honda extends Car yazarsan hata vermez ama honda sınıfından nesne üretemezsin
final ı yazdık cünkü başka class inherit etmesin istedik. böyle bi durum yoksa yazmana gerek yok.
 */

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }


    public void start(){ //parent class ile aynı veya daha görünür olmalı. return type ve parameter da aynı olmalı
        // bu metodu çağırdıgında sınıf ismindeki derleyici hatası kalkar
        System.out.println("Twist the key to ignition"); //complete the parent class abstract class method
        //sub class ta bu metodu tamamlamak zorunlu tamamlamazsan hata verir.
    }



}
