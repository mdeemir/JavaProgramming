package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);
// breed gender color artık değiştirilemez  çünkü final variable ONCE AND FOREVER
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());// final variable da aynı sekilde cağrılıyor. cünkü cağırma static veya instan olmasına
        //göre değişir. static ise sınıf ismi ile instance ise nesne ismiyle cağrılır.

        dog.drink();//yine static olmadığı için nesne ismiyle çağırdık




    }

}