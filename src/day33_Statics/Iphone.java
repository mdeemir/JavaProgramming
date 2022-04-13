package day33_Statics;

public class Iphone {
    public static String brand = "Apple";// bu sınıftan oluşturulacak her nesnede bu özellik aynı olacak

    public String model;
    public double price;

    public static String OS = "iOS"; // bu sınıftan oluşturulacak her nesnede bu özellik aynı olacak

    public String color;

    public String size;

    public static String madeIn = "China"; // bu sınıftan oluşturulacak her nesnede bu özellik aynı olacak

    public static boolean hasBattery = true;// bu sınıftan oluşturulacak her nesnede bu özellik aynı olacak

    public static boolean isTouchScreen = true;// bu sınıftan oluşturulacak her nesnede bu özellik aynı olacak

    public static boolean hasFaceTime = true;// bu sınıftan oluşturulacak her nesnede bu özellik aynı olacak

    public static void printOperatingSystem(){// bu sınıftan oluşturulacak her nesnede bu özellik aynı olacak
        System.out.println(OS);
    }
    //avantajı bu metodu cağırmak için nesneye ihtiyacın yok
    //hafızada daha az kaplar


    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods does not accept instances
    //  }


    public void method1(){ // public static void method1()  yazamazdın
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }

}
