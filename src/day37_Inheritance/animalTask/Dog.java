package day37_Inheritance.animalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String size, String color){
        //burada otomatik yükleme veya çağırma olamaz super anahtar kelimesiyle çağrılır. cons çağırma kuralları geçerli
        super(name, breed, gender, age, size, color);
        //burada da 6 tane argumenti girmelisin animal class ta cons da 6 parametre var
        /*
        super kelimesi bu kodları tekrar yazmamamızı sağlıyor
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
         */
    }

    public void bark(){

        System.out.println(name+" is barking");
    }
}
