package FiguraGeometrica;

import FiguraGeometrica.Triangulo;
import FiguraGeometrica.Trapezio;
import FiguraGeometrica.Quadrado;
import FiguraGeometrica.Retangulo;
import FiguraGeometrica.Circunferencia;

public class Principal {
    public static void main(String[] args){
        Triangulo t1 = new Triangulo();
        t1.setValores(2,3,4,4);
        System.out.println(t1.calcularArea());
        System.out.println(t1.calcularPerimetro());
        
        Trapezio tr1 = new Trapezio();
        tr1.setValores(11, 5, 4);
        System.out.println(tr1.calcularArea());
        System.out.println(tr1.calcularPerimetro());
    }
}
