package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args)  {

        System.out.println("Hello");

        //    sleep(2.5); // throws    hata verdi çünkü diğer metod içine cağırdık

        System.out.println("Hello world");

        System.out.println("-------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch ı kullandık başka metod içinde çağırmak için

        System.out.println("Cydeo");


    }


    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep( (long) (seconds * 1000) );

    }

}
