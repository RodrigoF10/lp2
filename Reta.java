public class Reta{
	private Ponto p1,p2;
	public void setP1(Ponto p1){
		this.p1 = p1;
	}
	public void setP2(Ponto p2){
		this.p2 = p2;
	}
	public Ponto getP1(){
		return this.p1;
	}
	public Ponto getP2(){
		return this.p2;
	}
	public double area(){
		double x1, x2,y1,y2,xr,yr;
		x1 = getP1().getX();
		x2 = getP2().getX();
		y1 = getP1().getY();
		y2 = getP2().getY();
		xr = x1 - x2;
		yr = y1 - y2;
		xr = Math.abs(xr);
		yr = Math.abs(yr);
		if((yr - y1)<(yr - y2)){
			return((y2*xr)+((xr*yr)/2));
		}
		 if((yr - y1)>(yr - y2)){
                        return((y1*xr)+((xr*yr)/2));
                }
		return 1; 
	}
}


