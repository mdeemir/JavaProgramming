package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");

        System.out.println(dog1);

        dog1.bark();
        //dog1.scratch();--->dog class a ait değil
        //dog1.sing();---> dog class a ait değil



        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");
// Cat cat1 = new Cat() bu şekilde nesne oluşturamazsın cat classından cunku public Cat(String name, String breed, char gender, int age, String size, String color) parametreli cons oluşturduk
        System.out.println(cat1);
        cat1.scratch();
        //  cat1.bark();---> cat class a ait değil
        //  cat1.sing();---> cat class a ait değil


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1);

        parrot1.sing();
        //  parrot1.bark();---> parrot class a ait değil
        //  parrot1.scratch();---> parrot class a ait değil


    }
}
