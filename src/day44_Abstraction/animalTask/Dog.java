package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{
// abstraction yapmak için inheritance yapmak zorundayız. abstract inherit olmadan olmaz.
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    //name yazamayız çünkü private değişkeni get veya setter ile çağırabilirim
    }


    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }//bu yazmadığın sürece hata cizgisi görürsün çünkü
    // parent class ta tamamlamadan bıraktığımız eat metodu var onu tamamlaman lazım
    // ikinci olarak da cons. oluşturman lazım çünkü parent class ta default con kullanmadık. super ile çağırman lazım. çağırmadıgın sğürece hata cizgisi alırsın

    public void play(){
        System.out.println(getName() +" is playing with ball");
    }


}
