package day30_CustomClass;

public class Car {
    //custom class ta run için main metodu oluşturma
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    // her class için gerekli parameterları girmek için. veri tipi ve veri adı yazıp değişkene atıyorsun
    //bu metodu çağırdıgında 5 tane argument girmen lazım
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){

        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }

    // nesnenin yazdırılmasını istiyorsak tostring metod olmalı. bunu kısa yoldan yapmak için metod oluştuacagın yere sağ tıkla
    // generate tıkla oradan tostring isec hangi özellikleri yazdırmak istiyoran seç sonra sol alttaki inser&.. kutucugunun
    //işaretini kaldır OK bas otomatik toStringi oluşturur. her print yapmak istediiin sınıfta bunu kullanackasın. yapmazsan yazdırma
    //yapamazsın

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }


    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }


    public void start(){
        System.out.println(brand+" "+model+" has started");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
