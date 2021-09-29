package edu.uaslp;

import edu.uaslp.Figures.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Square cuadrado = new Square();
        Rectangle rectangulo = new Rectangle();
        Triangle triangulo = new Triangle();
        RegularPolygon poligonoRegular = new RegularPolygon(5);
        Circle circulo = new Circle();

        List<Figure> figuresList = new LinkedList<>();

        figuresList.add(cuadrado);
        figuresList.add(rectangulo);
        figuresList.add(triangulo);
        figuresList.add(poligonoRegular);
        figuresList.add(circulo);

        //printItems(figuresList);
        printItems2(figuresList);
    }

    public static void printItems(List items){
        for(Object item: items){
            if(item instanceof Square){
                System.out.println("--- "+((Square)item).getName()+" ---");
                ((Square)item).Draw();
            }else if (item instanceof Rectangle){
                System.out.println("--- "+((Rectangle)item).getName()+" ---");
                ((Rectangle)item).Draw();
            }else if (item instanceof Triangle){
                System.out.println("--- "+((Triangle)item).getName()+" ---");
                ((Triangle)item).Draw();
            }else if (item instanceof RegularPolygon){
                System.out.println("--- "+((RegularPolygon)item).getName()+" ---");
                ((RegularPolygon)item).Draw();
            }else if (item instanceof Circle){
                System.out.println("--- "+((Circle)item).getName()+" ---");
                ((Circle)item).Draw();
            }
        }
    }

    public static void printItems2(List<Figure> items){
        for(Figure item: items){
            System.out.println("--- "+item.getName()+" ---");
            item.Draw();
        }
    }
}
