package day43_Abstraction.car;

public final class Tesla extends Car {
// final ı yazdık cünkü başka class inherit etmesin istedik. böyle bi durum yoksa yazmana gerek yok

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }
//autopilot metodu teslaya özgü



}
