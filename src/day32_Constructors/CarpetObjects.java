package day32_Constructors;
/*
    object:
        new ExistingConstructor
 */
public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3, 5, 8, true);

        Carpet carpet2 = new Carpet(10, 20, 10, false);


        System.out.println(carpet1);//Carpet{width=3.0, length=5.0, unitPrice= $8.0, isPersian=true, total price= $320.0}
        System.out.println(carpet2);//Carpet{width=10.0, length=20.0, unitPrice= $10.0, isPersian=false, total price= $2000.0}


    }

}
