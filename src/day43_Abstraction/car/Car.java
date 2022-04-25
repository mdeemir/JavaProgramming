package day43_Abstraction.car;

public abstract class Car {

    private final String brand, model;// bir kere tanımlanınca bir daha değişmesini istemiyorum
    private String color;//değişeblir olarak ayarladık set metod ile
    private final int year;// bir kere tanımlanınca bir daha değişmesini istemiyorum
    private double price;//değişeblir olarak ayarladık set metod ile

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if(year < 1886){
            throw new RuntimeException("Invalid Year: "+year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }

        this.price = price;
    }

    public  void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();//parent class için metodun ayrıntıları önemli dğeil sadece ne yaptığı önemli nasıl yaptığı değil
    /*
    {}   body olmadan bi metod oluşturduk. bu şekilde compiler erro verirdi. abstact yazmazsak bu hata geçmez.
    metodu abstract yaptığında sınıfı da abstract yapman lazım. yapmazsan yine derleyici hata verir.
     private abstract void start(); ---> olamaz derleyici hata verir
      public final abstract void start(); ----> olamaz derleyici hata verir
       public static void start();----> olamaz. derleyici hata verir.
       abstract class parent class olması lazım bu nedenle public final abstract class Car ---> olamaz  çünkü parent class olabilmeli


     */


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
