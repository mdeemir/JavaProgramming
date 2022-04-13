package day31_Constructors.scrumTask;
/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */
        // class ismi ile aynı olmalı
public class Tester {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


}
