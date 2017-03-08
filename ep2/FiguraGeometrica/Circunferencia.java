package FiguraGeometrica;

public class Circunferencia extends FiguraGeometrica{
    private double raio;
    public void setValores(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        this.area = ((this.raio*this.raio) * Math.PI);
        return this.area;
    }
    public double calcularPerimetro(){
        this.perimetro = 2*(this.raio * Math.PI);
        return this.perimetro;
    }
}
