package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
        //job title bütün scrum master da aynı olduğu için onu yazdık cons. dan da çıkardık
    }

}