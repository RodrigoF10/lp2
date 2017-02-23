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

		Ponto p1 = new Ponto();
                        p1.setX(20);
                        p1.setY(10);
                Ponto p2 = new Ponto();
                        p2.setX(16);
                        p2.setY(7);
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		r1.getP1().getX();
		r1.getP2().getY();
		p1.setX(30);
		r1.getP2().setY(40);
		System.out.println("r1.p1.x= " + r1.getP1().getX() + " r1.p1.y = " + r1.getP1().getY() + " r1.p2.x= " + r1.getP2().getX() + " r1.p2.y= " + r1.getP2().getY());
		System.out.println("Rodrigo");

		double re = r1.area();
		System.out.println(re);
			}
}

