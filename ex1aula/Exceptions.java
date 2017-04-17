public class Exceptions{

	private int variavel1;

	public static void main(String[] args){

//		testeException1();
//		testeException2();
//		testeException3();
		try{
			testeException4();
		}
		catch(NullPointerException e){
			System.out.println("Erro NullPointerException");
		}
	}

	public static void testeException1(){

		int [] vetor1 = new int[5];
		System.out.println("Teste Exceptions 1 - Início");
		try{

			vetor1[6] = 10;
			System.out.println("Teste Exceptions 1 - Final");

		}
		catch(Exception e){

			System.out.println("Ocorreu um erro, ele foi: ");
			e.printStackTrace();

		}

	}

	public static void testeException2(){

		int [] vetor1 = new int[5];
		System.out.println("Teste Exceptions 2 - Início");
		try{

			vetor1[6] = 10;
			System.out.println("Teste Exceptions 2 - Final");

		}
		catch(ArrayIndexOutOfBoundsException e){

			System.out.println("Ocorreu um erro, ele foi: ");
			e.printStackTrace();

		}

	}

	public static void testeException3(){

		int [] vetor1 = new int[5];
		System.out.println("Teste Exceptions 3 - Início");
		try{

			vetor1[6] = 10;
			System.out.println("Teste Exceptions 3 - Final");

		}
		catch(ArrayIndexOutOfBoundsException e){

			System.out.println("Ocorreu um erro, ele foi: ");
			e.printStackTrace();

		}
		finally{

			System.out.println("Teste Exceptions 3 - Finally");
		}

	}

	public static void testeException4() throws NullPointerException{
		int [] vetor1 = new int[5];
		System.out.println("Teste Exception 4 - Inicio");
		try{
			vetor1[6] = 10;
		}
		catch(Exception e){
		throw new NullPointerException();
		}
	}
}
