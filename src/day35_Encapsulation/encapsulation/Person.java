package day35_Encapsulation.encapsulation;

public class Person {

    private String name;//sınıfın dışında bu değişkene doğrudan ulaşılamaz çünkü private yani bu class a özgü
    private int age; // bunlara sınıf dışında ulaşmak için instance metodlar kullanılır. getter ande setter metodlar

    public String getName(){
        /*
        static metod olmaz
        herzaman getter ve setter da public metod kullanılır
        getter bir instance metodttur ve return tiipi returndür çünkü get değişkenin değerini getirir
        değişken ile getter ile getirilecek değişkenin değişken tipi aynı olmalı (string = string)

         */
        return name;
    }

    public void setName(String name){
        /*
        static metod olmaz
        name değişkenin değerini değiştirmek için yani set ayarlamak için setter metodu kullanılır
        bu da bir ins metodttur ve return tipi void dir.
        yine iki değişkenin de veri tipi eşleşmeli (string=string)
        parametre girilmesi zorunlu çünkü parmeter değişecek önemli olan ikisinin veri tip iaynı olmlı
        this ile kullanırsın aynı değişken ismi olduğu için
         */
        this.name = name;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age <= 0 || age > 150){
            System.err.println("Invalid Age: "+age);
            System.exit(0);
        }
        /*
        //getter ve setter birer metod olduğu için değişkeni değiştitiken veya değerini alırken koşul bloğu ekleyebilirsin
        ama public olsa böyle bir imkanın olmayacak get ve set in avantajı bu
        private da kontrol sende public te bu yokbir koşula bağlayabildik

         */



        this.age = age;
    }

}
