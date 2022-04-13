package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");//1 parametre ile nesne oluştuduk

        Employee employee2 = new Employee("Yuliya", 'F');// 2 parametre ile nesne oluşturduk

        Employee employee3 = new Employee("Olga", 'F', "SDET"); // 3 paametre ile nesne oluşturduk


        System.out.println(employee1);

        System.out.println(employee2);

        System.out.println(employee3);

    }
}
