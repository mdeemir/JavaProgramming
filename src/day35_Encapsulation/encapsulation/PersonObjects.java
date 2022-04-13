package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
        // p1.name = "Daniel"; ---> bu şekilde yazdığımızda kabul etmedi hata verdi çünkü değişken tipi private
        //  p1.age = 28; ---> bu şekilde yazdığımızda kabul etmedi hata verdi çünkü değişken tipi private

        //   p1.name = "";---> bu sekilde değiştirmeye calıştım kabul etmedi çünkü private
        //   p1.age = 2000; ---> bu sekilde değiştirmeye calıştım kabul etmedi çünkü private

        p1.setName("Daniel"); //----> değiştirmek için set medodu kullnadım
        p1.setAge(45);//----> değiştirmek için set medodu kullnadım

        //    System.out.println(p1.name +" : "+p1.age);---> olmadı çünkü private

        System.out.println(p1.getName()+" : "+p1.getAge());



    }
}
