import java.util.Scanner;

public class Principal{
	public static void main(String[]args){
		Lista lista1 = new Lista();
                String opc = null;
                Scanner scanner = new Scanner(System.in);
                int x;
                while(!"4".equals(opc)){
                    System.out.println("--------------------");
                    System.out.println("|1- Adicionar Item |");
                    System.out.println("|2- Buscar Item    |");
                    System.out.println("|3- Remover Item   |");
                    System.out.println("|4- Sair           |");
                    System.out.println("--------------------");
                    System.out.print("Sua opção: ");
                    opc = scanner.next();
                    switch(opc){
                        case "1":
                            System.out.print("Qual item deseja inserir? ");
                            x = scanner.nextInt();
                            lista1.inserir(x);
                            break;
                        case "2":
                            System.out.print("Qual item deseja buscar? ");
                            x = scanner.nextInt();
                            if("A lista está vazia".equals(lista1.buscar(x)))
                                System.out.println(lista1.buscar(x));
                            else if(!"1".equals(lista1.buscar(x)))
                                System.out.println("O item " + x + " aparece " + lista1.buscar(x) + " vezes na lista");
                            else
                                System.out.println("O item " + x + " aparece " + lista1.buscar(x) + " vez na lista");
                            break;
                        case "3":
                            System.out.print("Qual item deseja remover? ");
                            x = scanner.nextInt();
                            lista1.remover(x);
                            break;
                        case "4":
                            System.out.println("Fechando...");
                            break;
                        default:
                            System.out.println("Valor inválido, tente novamente");
                    }
                }
	}
}