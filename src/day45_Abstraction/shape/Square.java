package day45_Abstraction.shape;

public class Square extends Shape{

    private double side; // SHAPE İ EXTEND ETMEDEN ÖNCE KARE YE ÖZGÜ DEĞİŞKENLERİ METODLARI EKLE. ÇÜNKÜ CONS OLUŞTURURKEN GENERATE İEL BUNLARI DA EKLER
    // PRİVATE YAPTIK KONTORL SAĞLAMAK İÇİN ---> GTTER VE SETTER KULLANACAZ

    public Square( double side) {
        super("Square"); // İSİM HEPSİNDE AYNI OLDUĞU İÇİN İSİM DEĞİŞKENNİN ÇIKARDIK PARENT CLASS TAN CAĞISIRILANI
        setSide(side); // AYARLANMIŞ SİDE DEĞİŞKENİNİ KULLANMAK İSTİYORUM

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){ // PRİVATE YAPARAK STTER KULLANABİLDİK
          throw new RuntimeException("Invalid Side: "+side); // THROW İLE KENDİ EXCEPTİONUMUZU OLUŞTURDUK
        }
        this.side = side;
    }


    public double area() { // ABSTRACT PARENT CLASSTAN GELEN ABSTRACT METODLARI TAMAMLADIK
        return side * side;
    }

    public double perimeter() {  // ABSTRACT PARENT CLASSTAN GELEN ABSTRACT METODLARI TAMAMLADIK
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+ // SUPER ANAHTAR KELİMESİ İLE TO STRİNGİ ÇAĞIRDIK. TEMİZ KOD
                "side=" + side +
                '}';
    }


}
