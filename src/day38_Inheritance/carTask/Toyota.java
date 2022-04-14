package day38_Inheritance.carTask;

public class Toyota extends Car {

    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

//public > protected > default > private (görünürlük sıralaması)
    /*OVERRİDİNG
    Giving different implementations to the method
• One method having multiple different implementations
• Overriding a method must take place in subclass
• Less memory usage and Improves the reusability of our code
     */
    public void start(){// overriding metod. önce bunu yürütür java parent class taki metod yeirne
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }


}

/*
1. Toyota:
					extra methods:
							reliable()
 */
