package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tahir", 'M', 30, 120000);
        // geçerli verilerin girilmesini sağlıyor bu şekilde set ve get metodlarını kullanmak
        //geçerli veri girilmezse default değişken değerlerini gçsterir null, 0, 0.0 vs

        employee1.setAge(32);// nesne oluturduktan sonra bu değişkenlerden birini değiştirmek istersenyine set metodu
        //kullanmalısın çünkü veri tipi private. yani employee1.age=32 yazarsan kabul etmez private çünkü
        //private değişken sınıf dışında doğrudan kullanılamaz


        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary( employee2.getSalary() + 15000 );//private salary değişkeninin değerini almak için get metodunu kullandık
//sadece employee2 nin salary isi değişti çünkü instance değişken yani her nesnenin ayrı kopyası var
        System.out.println(employee1);
        System.out.println(employee2);


    }

}
