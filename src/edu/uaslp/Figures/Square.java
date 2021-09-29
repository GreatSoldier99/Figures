package edu.uaslp.Figures;

public class Square extends Figure implements FigureWithSides{

    public Square(){
        super("Cuadrado");
    }

    public void Draw(){
        System.out.println("Tengo 4 lados iguales.");
    }

    public int getSidesCount(){
        return 4;
    }
}
