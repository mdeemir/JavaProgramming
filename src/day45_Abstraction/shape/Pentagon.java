package day45_Abstraction.shape;

public class Pentagon extends Shape{
    //EKSTRA EKLENECEKLERİ HOCA BİZE BIRAKTI
    //ALAN VE CEVRE HESAPLAMAK İÇİN GEREKLİ OLANLARI

    public Pentagon(String name) {
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
}
