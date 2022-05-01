package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;  // static & final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){
        this.a =a;
    }
    */

    /*
    static{
        b = 100;
    }
    */

    /*
    public void method1(){
        System.out.println("Instance method");
    }
     */
// interface de kullannabildiğin 3 metod türü
    static void method2(){ // PropertiesOfInterface ismiyle cağırabilirsin
        System.out.println("Static method");
    }

    void method3();

    default void method4(){
        /* java 8 den sonra eklendi. eğer interface içinde normal class taki gibi instance bir metod ve  kod blogu
        ile bi metod oluşturmak istiyorsan interface de bunu default anahtar kelimesi ile yapabiliyorsun sadece

          void method3(); bu abstract metod ile blok cağıramazsın

          blok yazmanın bize sağladığı kolaylık interfacede bi kere yazdığın bi metodu sub claslarda bunu
          ine aynen yazacaksan bir kere yazmanı sağlıyor. diğer sub claslara bu inheritance ile aktarılıyor

yani interface da instance metod kullanamdığımız içi javaya default metod eklenmiş ve interface de instan gibi
kullanabiliyorux
         */
        System.out.println("Default method");
    }

}

class Test implements PropertiesOfInterface{

    @Override  // abstract metodun gövdesi olmadığı için mecbur implement eklemelisin yoksa hata verir
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();  //default olan metodu class ismi ile cagırabildim

    }


}

