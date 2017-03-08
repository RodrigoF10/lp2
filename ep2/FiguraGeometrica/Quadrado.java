package FiguraGeometrica;

public class Quadrado extends FiguraGeometrica{
    private double base, altura;
    public void setValores(double base){
            this.base = base;
    }
    public double calcularArea(){
        this.area = this.base*this.base;
        return this.area;
    } 
    public double calcularPerimetro(){
        this.perimetro = 4*(this.base);
        return this.perimetro;
    }
    
}
