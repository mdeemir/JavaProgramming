package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1  = new Dog();//Syntax Dog() constructor sınıf ismi ile aynı olmalı
        //dog sınıfından dog1 isminde yeni bir nesne oluşturduk
        // dog1 nesnesinde 6 adet data hafızaya aldık
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();

        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        // tek tek alt alta yazmaktansa set info metodu oluşturup sadece değişken datalarını girmen yeterli
        //dog class a bak
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

        // nesnenin bütün değişkenlerini ve datalarını yazdırmak için toString metod kullaıyoruz
        System.out.println(dog1);//Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}  ---> toString metodu sayesinde
        System.out.println(dog2);//Dog{name='ACE', breed='Husky', age=5, gender=M, size='Large', color='White & Black'}
        System.out.println(dog3);//Dog{name='Jack', breed='German Shepard', age=2, gender=M, size='Large', color='Black'}

        //nesneye ait değişkenleri tanımlamadan yazdırırsan boş olan verilere null (v)eya 0 veya 0.0 default değerleri) olarak yazdırır

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-----------------------------------");


        //Dog data type a göe array oluşturduk değişkenleri de nesneler olur.
        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        // data type <Dog>  class ismi
        ArrayList<Dog> femaleDogs =new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();





    }
}
