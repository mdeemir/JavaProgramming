package day37_Inheritance.animalTask;

public class Animal {
    public String name, breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    /*
    setinfo metodu kullanma constructor kullan. çünkü tektek yazman lazım. cons kullanırsan nesne oluştururken parametleri belirlesin hızlıca
    default constructor varsa bu otomatik olarak(implitass lara yüklenir.
If parent class has default constructor, sub class calls it implicitly, otherwise
super class’ constructor need to be called explicitly in the sub class
     */
//burada default cons yerine biz oluşturduk bunu oluşturdugunda sub class hata verir çünkü cons. explitly olarak kendin yüklemelisin
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void  move(){
        System.out.println(name+ " is moving");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
