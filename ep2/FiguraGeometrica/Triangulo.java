package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica{
    private double base, altura,lado1,lado2,lado3;
    public void setValores(double base, double altura, double lado2, double lado3){
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double calcularArea(){
        this.area = (this.base * this.altura)/2;
        return this.area;
    }
    public double calcularPerimetro(){
        this.perimetro = this.base + this.lado2 + this.lado3;
        return this.perimetro; 
    }
}
