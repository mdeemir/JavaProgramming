package day45_Abstraction.shape;

/*
interface XX{

}


interface YY{

}


abstract class BB{

}

abstract class AA{

}
*/


public class Circle extends Shape { //SHAPE CLASSI İNHERİT ETTİK. SHAPE ABSTRACT OLDUĞU İÇİN ABSTRACT METODLARI TAMAMLAMALIYIZ.
//KISAYOL İLE EKLE METODLARI
    //AYRICA CONSTRUCTOR I CAGIRMALISIN.
    private double radius; //PRİVATE YAZINCA ENCAPSİLATE YAPMALISN GETTER VE SETTER KULLANCAN.

    public final static double pi = 3.14; //HER ÇEMBER İÇİN AYNI OLDUĞU İÇİN STATİK, DEĞİŞMEYECEĞİ İÇİN FİNAL YAPTIK


    public Circle( double radius) {
        super("Circle"); // PARENT CLASSIN CONS. ÇAĞIRDIK. AD HEPSİMDE CİRCLE OLDUĞUNDAN CİRCLE YAZDIK YUKARDAN DEĞİŞKENDEN ÇIKARDIK
        setRadius(radius); // YARIÇAPI KONTROLLU KULANMAK İSTİYORUM. BU YÜZDEN THİS.RADİUS=RADİUS DEMEDİM .
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){ //PRİVATE YAPTIK SETTER İLE AYARLIYORUZ KOŞUL EKLEDİK. DATA ÜZERİNDE DAHA FAZLA KONTROL SAĞLIYOR
            throw new RuntimeException("Invalid Radius: "+radius); //KENDİMİZ EXCEPTİON NESNESİ OLUŞTURDUK
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * pi;
    } // SHAPE ABSTRACT CLASSI İNHERİT ETTİK ONDAKİ ABSTRACT METOD TAMAMLANDI

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }
    //// SHAPE ABSTRACT CLAASI İNHERİT ETTİK ONDAKİ ABSTRACT METOD TAMAMLANDI

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+ // PARENT CLASS TAKİ TO STRİNG ÇAĞIRDIM KISAYOLDAN .SUPER ANAHTAR KELİMESİ İLE
                ", radius=" + radius +
                '}';
    }


}
