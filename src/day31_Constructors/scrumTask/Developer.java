package day31_Constructors.scrumTask;
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary
	          Add A constructor that can set all the fileds
	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */
public class Developer {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
// sadece developer class tan çağıralacak metodlar
    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }



}
