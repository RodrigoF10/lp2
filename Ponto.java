public class Ponto{
	private double x,y;
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
			p1.setX(10);
			p1.setY(20);
		Ponto p2 = new Ponto();
			p2.setX(15);
			p2.setY(30);
		Ponto p3 = new Ponto();
			p3.setX(50);
			p3.setY(70);
		p3 = p1;
		Ponto p4 = p3;
		
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p2.getX());
		System.out.println(p2.getY());

	}
}
