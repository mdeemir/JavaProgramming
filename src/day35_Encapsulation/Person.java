package day35_Encapsulation;
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;
    //staticleri class boyunca çağırabilirsin. class çağısıldığında önce staticler yüklenir 10 kere cağırsanda bir
    //kere yüklenir. bu yterli zaten bir copy si lazım



    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{// static değişkenler yüklemek için static kod kullanılır. birden çok adımı olan değişken yüklemelerinde
        //mesela excel dosyasını ac sutunalrı tara vs.
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;


    }

    public static void printPlanetName(){
        /*
        static metod olmal çünkü sadece static değişken kullanacam. instance kullacaksam public kullan
        instance metodu sınıf dışında kullanman için ojject oluşturman lazım
        ama staticte objecte bağlı değil sınıfa bağlı. sınıf ile de çağırabilirsin object ile de
        insance ları sınıf ismiyle çağıramazsın nesneye ihtiyac duyarsın
        static metodun içine instance yazarsan hata verir.
        metod ins ihtiyaç duyuyorsa static olmaz önce buna bakman lazım

        sınıfın static olması için nested class olmalı ve inner klass olmalı öğrenmiştik
        tek koptası oluşur  static metodun
         */
        System.out.println("Planet name is "+planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
        /*
        burada name instance olduğu için metod stataic OLMADI. instnce olunca metot mUTLAKA İNSTANCE OLMALI
        farklı kopyaları olusur metodun
         */
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';

        /*
        to string metod instance metoddur. nesneye bağlı. buna stativ variable ekleyebilirsin.
        çünkü objecti cağırmak için sınıfı cağıracaksın sınıf çağrıldığında da staticler yüklemecek otomatik
         */
    }


}
