package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{ // VOLUME İNTERFACE EKLENDİ
//EKSTRA EKLENECEKLERİ HOCA BİZE BIRAKTI
    //ALAN VE CEVRE HESAPLAMAK İÇİN GEREKLİ OLANLARI

    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    } // İNTERFACE  TAN GELEN METOD
}
