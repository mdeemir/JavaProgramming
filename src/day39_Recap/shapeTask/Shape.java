package day39_Recap.shapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1: some thing went wrong
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }


    public Shape(String name) {
        setName(name);
    }


    public double area(){ //private olamaz cünkü override yapacaz
        return 0;//bu değer zaten değişecek onun için 0 veya 200000 yazmışın önemli değil
        // önemli olan return bi metod olduğu çin bi değer dndürmesi lazım onu yaz
    }

    public double perimeter(){
        return 0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */