package day39_Recap.cydeoTask;


public class Student extends Person  {//personun sub classı

    private int studentId;//student clas a özgü değişkenler
    private String fieldOfStudy;// koşullu değişken ve kontrolunu sağlamak için private

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender); //person un değişkenlerini yükledi
        setStudentId(studentId); //kontrollü değişken olsun istiyoruz
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }


}

/*
6. Create a sub class of Person named Student
            Extra variables:
                studentId, fieldOfStudy
            Encapsulate all the fields
            Add a constructor to set all the fields
            Encapsulate all the fields
            Methods:
                study()
 */
