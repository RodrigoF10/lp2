public class Principal{
	public static void main(String[] args){
		Singleton a1 = Singleton.getInstancia();
		Singleton a2 = Singleton.getInstancia();
		Singleton a3 = Singleton.getInstancia();
		Singleton a4 = Singleton.getInstancia();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);	
	}
}