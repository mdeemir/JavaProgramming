package day42_Exceptions;
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each
			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */
public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("------------Push up started----------");

        for (int i = 1; i <= 30 ; i++) {

            System.out.print("\rPush up "+i);

            sleep(1.5);//---> kendimiz sleep methodu oluşturduk. ve değişkeni second olarak verdik.
            // her zzaman thread.sleep metodunu çağırdıgımız da try-catch ile uğraşmayalım diye. bir kere sleep() metodu oluşturup
            //try-cath i içine yazdık

        }

        System.out.println("\n------------Push ups completed----------");

        System.out.println("------------Pull up started----------");

        for (int i = 1; i <= 20 ; i++) {

            System.out.print("\rPull up "+i);
            sleep(2.5);
        }

        System.out.println("\n------------Pull ups completed----------");


    }

    //                      2.5
    public static void sleep(double seconds)  {//SELENİUMDA BU SLEEP METODU ÇOK KULLANIRSIN


        try {
            Thread.sleep( (long) (seconds * 1000) );
            // Thread.sleep bizden long veri tipini istiyor
            //(long) seconds * 1000  yazmadık cünkü mesela 2,5 second değerini önce long ile 2 ye cevirir sonra 1000 ile carpar bu şekilde
            //(long) (seconds * 1000) yazdık çünkü önce 2,5*1000= 2500.0 elde ettik sonra longa cevirince 2500 oldu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
