public class Ponto{
	private double x,y;
	public Ponto(){
		System.out.println("Construtor1-" + this);
	}
	public Ponto(double x){
		System.out.println("construtor 2");
	}

	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return y;
	}

	public static void main(String[]args){
		System.out.println("Rodrigo");
		Ponto p1 = new Ponto();
			p1.setX(20);
			p1.setY(10);
		Ponto p2 = new Ponto();
			p2.setX(16);
			p2.setY(7);
		double cat1,cat2;
		cat1 = p1.getX()-p2.getX();
		cat2 = p1.getY()-p2.getY();
		cat1 = cat1*cat1;
		cat2 = cat2*cat2;
		System.out.println(Math.sqrt(cat1+cat2));
	}
}

