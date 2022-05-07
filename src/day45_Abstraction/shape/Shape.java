package day45_Abstraction.shape;

public abstract class Shape {//ABSTRACT METODU KULLANDIGINDA CLASSI DA ABSTARCT YAPMALISIN. YANİ TAMAMLANMAYA
    //İHTİYACI OLAN SOYUT BİR SINIF OLMALI. ÇÜNKÜ CHİLD CLASS ABSTRACT METODU ALACAK MECBUR ALINCA DA TAMAMLAMAK ZORUNNDA KaLACAK
    //TAMAMLANMAYA MUHTAÇ OLDUGUNDAN CLASS DA ABSTRACT METOD OLMALI

    private final String name;
//FİNAL OLDUĞUİÇİN SETTER VERMEZ GENERATEDEN OLUŞTURURKEN. AMA FİNAL OLDUĞU İÇİN İNSTANCE DEĞİŞKENİ
//İLK DEFA OLUŞTURUKEN ATAMALISIN THİS.NAME=NAME YAPTIK NESNE OLUŞTURDUK
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();  //{}  EKLEMeDİK VE ABSTRACT YAPTIK. METOD GÖVDESİNİN TAMAMLANMASINI
    //CHİLD CLASS A BIRAKTIK. PARENT SACEDE METODUN TANIMLANMSI İLE SORUMULU. CHİLD CLASS TAMAMLAMAK İLE SORUMLU
//RETURN TYPE HERHANGİ BİRİ (VOİD VEYA RETURN METOD)OLABİLİR
    //STATİC VEYA FİNAL VEREMEZSİN ÇÜNKÜ TAMAMLANACAK.
    //PRİVATE DA YAPAMAZSIN ÇÜNKÜ CHİLD KULLANACAK
    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'';

    }


}
