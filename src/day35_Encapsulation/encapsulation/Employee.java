package day35_Encapsulation.encapsulation;
/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary
			Encapsulate all the private fields ---> kontrol edebilmek için encapsulate
				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {// constructor oluşturuldu
        //burada nesne oluştururken kullanıcının geçerli bir veri girip girmediğini nasıl kontrol edecez
        setName(name); //this.name=name diyorduk ama geçerli bir veri girsin diye bu şekilde yazdık
        setGender(gender);// bu fonksiyon da sonuçta ya girilen değer geçerli olmadığı için kabul etmiyor
        //yada  this.gender = gender; değerini atiyor
        setAge(age);
        setSalary(salary);
    }
//private instance değişken varsa getter and setter kullanabilirsin
// kısayolu sağ tıkla generate--->getter and setter veya getter tek veya setter. değişkenlerin hepsini yaparsan başka yapmaz
    //sadece bir kez getter ve setter olur her değişken için

    /*
    getter ve setter ikisi de public metod. private de yapabilirsin hata vermez ama mantıksız olur çünkü sınıf dışında
    kullanamazsın bi anlamı olmaz çünkü zaten sınıf dışında nesne değişkenlerini okuyor veya değiştiriyorsun

    getter return metod. değer döndürdüğü için isntance değişken ile veri tipi aynı olmalı. public ten sonra veri tipi yazılır
    public String getName()---> değişken değerini aldığımız için () içine parametre yazmıyoruz

    setter bir void metod. veri tipi instance değişkenle aynı olmalı
    public void setName(String name)
     */
    public String getName() {
        return name;
    } // getter da koşul eklemiyoruz değerini gösteriyor sadece

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

//her değişkeni ayrı ayrı set etme kodun flexibility sini artırır. ilerde tekrar değiştirmek istediğinde sadece o değişkeni tekrar set edersin
    public void setName(String name) { // stter da koşul eklenebiliyor
        if(name.isEmpty()){// buradaki name girilen argumentin name i değişken değil
            return; // metodttan çıkmak içinreturn metod
        }

        this.name = name; // this kulandık name=name olduğu için
    }

    public void setGender(char gender) {
        if(  !(gender == 'M' || gender == 'F')  ){ // f veya m değilse fonksiyondan çıkacak
            return;
        }

        this.gender = gender;// f veya m ise girilen f veya m = gender (isntance variable)  olacak
        //girlen değer valid ise gendere atanacak
    }

    public void setAge(int age) {
        if(age < 16 || age > 90){
            return;
        }

        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary <=0){
            return;
        }
        this.salary = salary;
    }

    public String toString() { // employeeobjects sınıfında nesneyi yzdırmak için
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}

/*
 Getter (Read Only): public instance method
			  					  Return type is not void
			  					  Return type must match with private instance variable' data type
			  					  Does not pass any parameter
			  					  Returns the private instance variables value

			  Setter (Write Only): public instance method
			  					   Return type is void
			  					   Passes a parameter
			  					   Parameter' data type must match with private instance variable' data type
			  					   reassigns the private instance variable to given argument
 */