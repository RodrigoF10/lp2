public class Singleton{
	private static Singleton e1;
	private Singleton(){
	}
	public static Singleton getInstancia(){
		if(e1 == null){
			e1 = new Singleton();		
		}
		return e1;	
	}
}