package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);// setside burada kenarı -10 girmene müsade etmiyor

        System.out.println(square);

        // square.side = -10000000; bunu yapamıyorum çünkü side ı private olarak ayarladık public olsa yapabilirdim. artık read için get ve ayarlamak için set kullanacaz
        square.setSide( 15 );

        System.out.println(square);

        System.out.println(square.getName());// square sınıfında getname yok ama parent classı shape cals ta var oradan metod ve  dğeişkenleri aldı child olarak

        System.out.println("------------------------");

        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println( rectangle.getLength() );

        System.out.println( rectangle);

        System.out.println(rectangle.getName());//System.out.println(rectangle.name) yazamadık çünkü shape (parent calss) sınıfın da private olarak ayarladık  ---> private String name;

        System.out.println("------------------------");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        //circle.radius = 15.5; -->olmaz  çünkü private ayarladık. set ile yapmmaız lazım

        circle.setRadius(15.5);

        System.out.println( circle.getRadius() );

        System.out.println(circle);

        System.out.println(circle.getName());






    }


}