package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {
// person1.setinfo(....)  yazanaya gerek kalmadı nesne oluştururken değişkenleri girebiliyorsun
        //faydası 10 tane object oluşturursan 10 kere setınfo metodunu cağırmalısın. ama bunda nesne oluştururken girenilyorsun nesneye ait verileri
        Person person1 = new Person("Daniel", 'M', 32);

        Person person2 = new Person("Kseniia", 'F', 28);

        person2.age = 30;

        System.out.println(person1);//Person{name='Daniel', gender=M, age=32}
        System.out.println(person2);//Person{name='Kseniia', gender=F, age=30}




    }


}
