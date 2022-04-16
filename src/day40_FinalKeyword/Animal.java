package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;
// bu sekilde cons oluşturdugun sürece final değişkenler hata vermez çünkü bi değer tanımlamış oluyorsun
// ama default cons olursa atama yapmadıgın için hata verir
    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;// 1 kere nesne oluşturulurken tanımlanacak ve değiştirilemeyecek
        this.gender = gender;// 1 kere nesne oluşturulurken tanımlanacak ve değiştirilemeyecek
        this.color = color;// 1 kere nesne oluşturulurken tanımlanacak ve değiştirilemeyecek
        this.size = size;
        this.age = age;
    }

    ////----------Setters---------------------
//final olanlarda da get kullanılır cğnkğ değerini alıyorsun.
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }


    //----------Setters---------------------
// final olanların setter ları yapılamadı cünkü zaten değiştirilemeyecek set yani yeniden ayarlama yapamazsın
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //----------Setters---------------------


    public void eat(){//sub classlar da bunu değiştirebilirm yani override yapabilirim
        System.out.println(name+" is eating");
    }

    public final void drink(){//metod artık override yapılamaz   AMA DİKKAT OVERLOAD a her zaman yapabiliriz
        System.out.println(name+" is drinking water");//bütün animallar için artık bu değiştiirlemez
    }



}
