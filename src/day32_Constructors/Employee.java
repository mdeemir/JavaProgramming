package day32_Constructors;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name){
        this.name = name;
        /*
        this(name); YAZAMAZSIN kural 	5. Constructor can not call or conatin itself
        this("Daniel",'F'); yan, 2. cons u da yazamazsın çünkü 2. cons 1. cons. çağırıyor
         */
    }

    public Employee(String name, char gender){
        this(name); //this.name = name;   constructor metodu diğer metod içinde çağırmak için bu ifadeyi kullanmalısın
        //  this(name) ilk cons. metod için.  Employee(name) yazarsan hata verir
        this.gender = gender;

    }
/*
Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself

 */
    public Employee(String name, char gender, String jobTitle){
        this(name, gender);//2. cons metodu çağırdık
        /*
        this(name); YAZAMAZSIN ikinci bir cons. çağıramazsın
        //4. One constructor can not call more than one constructor
         */
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
       //kural 	3. Constructor call MUST be at the first step
        this(name, gender, jobTitle);
        this.salary = salary;

    }


    /*
    public void method1(){
        this("Aaron");  BUNU YAZAMAZSIN kural 		2. Only a constructor can call another constructor
    }
*/

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */
}
