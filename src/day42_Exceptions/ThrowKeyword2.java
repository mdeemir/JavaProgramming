package day42_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {


        throw new NoSuchElementException("No such Element");//___>throw new NoSuchElementException() bu şekilde de olur ama mesaj yazmaz ekrana daha okunablilir olması için
        //    throw new InterruptedException();---> henüz complier ıngörecegi bir hata cıkmadan yazarsan yanı checed sınıfından bi nesne oluşturursan hata verir. çünkü henüz complier bi hata görmedi


        //  System.out.println("hello world");----> throw keyword den sonra bişey çalıştıramazsın hata mesajı verip bitirir

        // throw new Rectangle(5,7); ----> sadece exception nesnesi oluşturmak için kullanılır başka nesne için değil
        // nesneyi de exception sınıflarından birinden slaytta tablosu var seması



    }


}