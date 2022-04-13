package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{


    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);

        /*bütün ıphone lar için apple markası ortak oldugu için cons da brand çıkarıldı. super da apple yazdık. faydası Iphone
        sınıfından nesne oluştururken brand (apple) değişkenini girmene gerek kalmayacak
         */
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }


}


/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */