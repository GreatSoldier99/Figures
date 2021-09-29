package edu.uaslp.Figures;

public class Triangle extends Figure implements FigureWithSides{

    public Triangle(){
        super("Triangulo");
    }

    public void Draw(){
        System.out.println("Tengo 3 lados.");
    }

    public int getSidesCount(){
        return 3;
    }
}
