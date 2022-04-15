package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public double getSide() { //sağ tıkla generate kısayol
        return side;
    }

    public void setSide(double side) {//sağ tıkla generate kısayol sonra koşulu düzenle
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }

        this.side = side;
    }

    //                              -100
    public Square(double side) {//sağ tıkla generate kısayol sonra düzenle naame e gerek yok dğeişken için side da set side olacak ayarlı
        super("Square");
        setSide(side); //this.side=side yazmasık çünkü önce geçerli bir side mı kontorl etmek istiyoruz setside ile
    }


    public double area() {//sağ tıkla generate override methods tan seç hengi metod override olacaksa
        return side * side;
    }


    public double perimeter() {
        return side * 4;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */
