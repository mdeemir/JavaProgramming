package day30_CustomClass;
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */
public class Dog {

    // main metoduna gerek yok. sadece nesne oluşturmak için kullanıyoruz. run a gerek yok main metodla
   // instance variable sınıfın içinde metotların dışında tanımlanır
    public String name; // initilize etmiyorsun sadece tanımlama
    public String breed;// kaç tane nesne oluşturursan o kadar değişken hafızaya alabilirsin
    public int age;
    public char gender;
    public String size;
    public String color;

    //bunu kendin yapıyorsun kısayolu yok
    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
       // public static void yazarsan sadece bir kopya oluşturur bütün nesneler için. her nesne için farklı kopya oluşturmasını istediğimiz için
        // static kelimesini kullanmıyoruz
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }


    public void eat(){ //instance metod
        System.out.println(name+" is eating");
    }

    public void bark(){//instance metod
        System.out.println(name+" is barking");
    }
// nesnenin yazdırılmasını istiyorsak tostring metod olmalı. bunu kısa yoldan yapmak için metod oluştuacagın yere sağ tıkla
    // generate tıkla oradan tostring isec hangi özellikleri yazdırmak istiyoran seç sonra sol alttaki inser&.. kutucugunun
    //işaretini kaldır OK bas otomatik toStringi oluşturur. her print yapmak istediiin sınıfta bunu kullanackasın. yapmazsan yazdırma
    //yapamazsın

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
