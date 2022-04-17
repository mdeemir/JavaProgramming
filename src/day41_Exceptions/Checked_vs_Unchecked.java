package day41_Exceptions;


import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception:

        int a = 10;
        int b = 0;

        // System.out.println(  a / b  );----> bu hata ancak program çalıştıgında çıkıyor. programın yürümesini engelliyor
        //sonrasına geçmesini engelliyor
        //System.out.println("Wooden Spoon");

        char[] characters = {'A', 'B', 'C'};
        //                    0,   1,   2

        //  System.out.println( characters[99] );--->max index numberı aştık 99 a ulaşamazsın. derleyici bunu yazarken hata vermiyor
        //runtime da çalışırken bu hata veriyor ve program ilerlemiyor

        Student student = null;//null ile bir object oluşturulmaz boştur ama nesne değil

        // System.out.println( student.getName() );---> nesne olmadığı için simini de veremez.
        //student.study();---> object yok hata verir

        final String str = "Wooden Spoon";

        // str = null;--->

        //   System.out.println( str.toUpperCase() );---> str=null ise ortada bir object yok

        String str2 = ""; // object != null.   "" bu bir string object
        System.out.println(str2.isEmpty());// true



        // checked Exception:  ---> kodu yazarken çıkar derleyici hatayı gösterir. altta kırmızı çizgiyle belli eder.

        System.out.println("Hello");

       //Thread.sleep(3000); // checked

        //sleep in altında kırmızı çizgi çıkar solda kırmızı ampul ampiule tıkla seceneklerde ikinci surround with track and cathc seceneğini tıklarsan kısayoldan oluşturur
// kırmızı çizginin sonunda bekle bilgi penceresi çıkar hata hangi sınıfa ait nedeni ne vs.
        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked









    }

}
