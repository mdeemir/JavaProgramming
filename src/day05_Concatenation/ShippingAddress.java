/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */
package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name="Mustafa Demir ",
               buildingNumber="2545",
               streetName="Şehit Ali Yılmaz sk. ",
               city="Aksaray",
               state="Turkey";

        int zipCode=68200;

        //System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);

        String address=name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode;
        System.out.println(address);



    }
}
