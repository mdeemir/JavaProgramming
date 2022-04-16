package day40_FinalKeyword;


import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Circle circle;


    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public  void setCircle(Circle circle){
//public görünürlükte sınır koymaz public yazmazsan sadece package içinde görünür. private yazarsan sadece class içinde görünür
        if(circle.getRadius() < 5){
            return;
        }

        this.circle = circle;
    }


    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }


}
