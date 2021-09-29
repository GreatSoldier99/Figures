package edu.uaslp.Figures;

public class Rectangle extends Figure implements FigureWithSides{

    public Rectangle(){
        super("Rectangulo");
    }

    public void Draw() {
        System.out.println("Tengo 4 lados.");
    }

    public int getSidesCount(){
        return 4;
    }
}
