package day39_Recap.shapeTask;


    public class Rectangle extends Shape {

        private double length, width; //rectangle a özgüdeğişkenler

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            if (length <= 0) {//0 ve 0dan küçük olmasın
                System.err.println("Invalid Length: " + length);
                System.exit(1);
            }
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            if (width <= 0) {
                System.err.println("Invalid Width: " + width);
                System.exit(1);
            }
            this.width = width;
        }

        public Rectangle(double length, double width) {//constructor kısayolu generate den
            super("Rectangle");//ismi zaten rectangle olacak gerek yoktu değişken olarak girmeye
            setLength(length);
            setWidth(width);
        }


        public double area() {
            return length * width;
        }


        public double perimeter() {
            return 2 * (length + width);
        }


        public String toString() {
            return "Rectangle{" +
                    "length=" + length +
                    ", width=" + width +
                    ", area='" + area() + '\'' +
                    ", perimeter='" + perimeter() + '\'' +
                    '}';
        }

    }


/*
Rectangle extends Shape:
	variables:
		length
		width
	Encapsulate the fields
	Add a constructor to set the filed
	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */