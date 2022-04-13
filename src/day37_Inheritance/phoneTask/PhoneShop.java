package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);//Phone{brand='Apple', model='Iphone 12', size='6.7 inches', price= $1000.0, color='Black', has battery='true'}
        System.out.println(samsung);//Phone{brand='Samsung', model='galaxy S19', size='6 inches', price= $900.0, color='White', has battery='true'}
        System.out.println(nokia);//Phone{brand='Nokia', model='Brick', size='4 inches', price= $50.0, color='Gray', has battery='true'}

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("-------------------------------------------------");
//static değişkeni bütün sub claslarda çağırabilirsin
        System.out.println( Phone.hasBattery );
        System.out.println( Iphone.hasBattery );
        System.out.println( Samsung.hasBattery );
        System.out.println( Nokia.hasBattery );


    }
}
