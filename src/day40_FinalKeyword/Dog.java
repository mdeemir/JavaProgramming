package day40_FinalKeyword;

public final class Dog extends Animal {//sub class
//final class yaptığında artık dog class parent clas olamaz yani sub class oluşturamazsın dog classa bağlı olarak
    //snıf final olduğunda metodlar da default olarak final metod olur ama variable lar final variable olmaz

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){// final olmadığı için override yapabildikç
        System.out.println(getName()+" is eating dog food");//bunu yazmasını isityoruz ve değiştirdik override yaptık
    }

    /*
    public void drink(){  // final methods can not be overridden
        System.out.println(getName()+" is drinking beer");
    }
     */

    public void bark(){
        System.out.println(getName()+" is barking");
    }

}

