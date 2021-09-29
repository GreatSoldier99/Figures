package edu.uaslp.Figures;

public class RegularPolygon extends Figure implements FigureWithSides{

    private int sides;

    public RegularPolygon(int sides){
        super("Poligono Regular");
        this.sides = sides;
    }

    public void Draw(){
        System.out.println("Tengo "+sides+" lados iguales.");
    }

    public int getSidesCount(){
        return sides;
    }
}
