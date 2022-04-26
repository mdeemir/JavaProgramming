package day44_Abstraction.animalTask;

/*
class Test{

    public static void main(String[] args) {

        System.out.println(new Test().getClass().getSimpleName()); //---> TeSt yazar konsola
        System.out.println(new Test().getClass().getName()); ---> day44_Abstraction.animalTask.Test yazar konsola

    }

}
*/

public abstract class Animal {

    private String name;
    private final String breed;// ilk nesne oluşturmada atanan değerin değişmesini istemiyoruz bu yüzden final kullanıyorum
    private final char gender;// ilk nesne oluşturmada atanan değerin değişmesini istemiyoruz bu yüzden final kullanıyorum
    private int age;//her nesne için ayrı kopya oluşturulmasını istediğim için instance değişken olusturdum. birden çok kopyası olacak
    private String size;//her nesne için ayrı kopya oluşturulmasını istediğim için instance değişken olusturdum. birden çok kopyası olacak
    private final String color; // ilk nesne oluşturmada atanan değerin değişmesini istemiyoruz bu yüzden final kullanıyorum

    public final static boolean canBreathe; //tek kopya yeterli bütün nesneler için o yüzden static. ve ilk atamadan(asagıda) sonra değişssin istemiyorum.
//public final static boolean canBreathe=true;
    static{
        canBreathe = true;//static blok çinde değişkenin tanımlamasını yaptım
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        /*
          if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }  ---> böyle de yazılabilir ama setter da  ayarlamazsan başka yerde(nesne oluşturma dışında) setname metodu çağırırsan bu sefer koşulu kontrol etmez
    bu nedenle setname() metodu içinde yazmamız daha kullaışlı ve doğru çünkü setname metodunu her zaman çağırabilirsin
         */
        setName(name);

        this.breed = breed;//koşul eklemye gerek görmedşk eklemek isteseydik gender daki gibi cons içinde bunu yapmalıydık çünkü final değişken ve setter ı yok
//if blogu yani koşulu this.gender = gender; ifadesinden önce girmelisin ki önce koşulu test etsin.
// gender ı final olarak ayarladığımız için setter metodumuz yok bu nedenle cons oluştururken değerini vekoşulunu ekliyoruz
        if ( !(gender == 'M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;

        setAge(age);
        setSize(size);

        this.color = color;
    }
// final variable için setter otomatik yapılmaz çünkü zaten birkere ayarladıktan sonra değiştiremiyorsun.
    //cons oluturmadan final variable lar hata veriri çünkü ilk ayarlamyı cons eklerken ayarlanmalı
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){
        System.out.println(name+" is drinking");
    }//burada static kullanmak akla gelebilir çünkü değişmeyecek ama name değişkeni instance olduğu için static yapamayız
    //private da yapamayız çünkü diğer nesneler bunu kullanamaz. bu nedenle final bizim için en iyisi

    public  abstract void eat();/*imğlementation vermedik çünkü bunu sub classın tamamlamasını istiyoruz. biz sadece ne oldugunu tanımladık.
    nasıl olduğunu sub class a bıraktık. bunu yapabilmek için abstract metod kulanmalıyız. abstract metodu kulanmak için 2 yol var. abstract class veya
    interface kullanmalıyız. burada parent class animal olduğu için abstract class kullandık ve aimal classı abstarct class yaptık. animal abstaract class
    olunca artık bu class tan nesne oluşturaamayacaz. nesneleri sub classlardan oluşturacaz

    public  final abstract void eat(); final yapamayız çünkü bu metod override edilmek zorunda çünkü yarım. implemention u yok final yaparsan override yapılamaz
final ve abstract kelimelerinin birlikte kullanılması mantık gereği imkansız

    bu metodun artık çok sayıda implementionu olabilir. bunu sub classlar tamamlayacak.

    */


    @Override
    public String toString() {
        /*
        getClass().getSimpleName() class ismini cağırmak için bunu kullanabilir. getClass metodu class ile  ilgili bilgileri cağırır. bunlar arasından ismini cagırdık.
         */
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */