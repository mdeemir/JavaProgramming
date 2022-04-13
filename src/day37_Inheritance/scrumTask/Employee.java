package day37_Inheritance.scrumTask;

public class Employee extends Person{  // Employee IS A Person
//parent class perso da olmayan değişkenler Employee class a özgü olanlar
    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);// parent class tan inherit edilenler
        // employee class a özgü olanları yazıyoruz. super ilk adımda olacak dikkat
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name + "is working");
    }

    public String toString() {//parent class persondaki tostring sadece age name gender i yazdırır diğerleri için tekrar to string
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}


/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */
