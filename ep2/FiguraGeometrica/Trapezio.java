package FiguraGeometrica;

public class Trapezio extends FiguraGeometrica {
    private double baseMai,baseMen,altura;
    public void setValores(double baseMai,double baseMen,double altura){
        this.baseMai = baseMai;
        this.baseMen = baseMen;
        this.altura = altura;
    }
    public double calcularArea(){
        this.area = ((this.baseMai+this.baseMen)*altura)/2;
        return this.area;
    }
    public double calcularPerimetro(){
        double aux,dia;
        aux = (Math.pow((this.baseMai-this.baseMen)/2,2.0) + Math.pow(altura,2.0));
        dia = Math.sqrt(aux);
        this.perimetro = (2*dia)+ this.baseMai + this.baseMen; 
        return this.perimetro;
    }
}
