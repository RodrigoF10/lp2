package FiguraGeometrica;

public class Retangulo extends FiguraGeometrica{
    private double base, altura;
    public void setValores(double base, double altura){
        if(base != altura){
            this.base = base;
            this.altura = altura;
        }
        else{
            System.out.println("A base e a altura não podem ser iguais pois é um retangulo");
        }
    }
    public double calcularArea(){
        this.area = this.base*this.altura;
        return this.area;
    } 
    public double calcularPerimetro(){
        this.perimetro = 2*(this.base + this.altura);
        return this.perimetro;
    }
 }   
