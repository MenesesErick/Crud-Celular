package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manutencao {

	private static Scanner scan = new Scanner(System.in);
	private static List <Celular> listaCelular = new ArrayList<>();
	
	public static void main(String[] args) {
		int opcao = 0;

		Manutencao manutencao = new Manutencao();
		
		do {
			Manutencao.menu();

			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				
				Manutencao.incluir(null);
				
			
				break;
			case 2:
				
				System.out.println("Digite o id do dispositivo que quer excluir");
				Manutencao.excluir(scan.nextInt());
				
				break;
			case 3:
				
				Manutencao.listarTodos();;
			
				break;
			case 4:
				
				System.out.println("1 - IOS \n2 - ANDROID");
				Manutencao.listarComFiltro(Tipo.valueOf(scan.nextInt()));
				
				break;
			case 5:
				
				System.out.println("1 - Preto \n2 - Branco \n3 - Azul");
				Manutencao.listarComFiltro(Cor.valueOf(scan.nextInt()));
				
				break;
			case 6:
				
				System.out.println("Saindo do programa.");
				
				break;
			default:
				System.out.println("Opcao invalida. Tente novamente.");
				break;
			}

		} while (opcao != 6);


	}
	
	public static void incluir(Celular celular) {
		
		listaCelular.add(celular.lerDados());
			
	}
	
	public static void excluir(Integer id) {
		
		System.out.print(id + " - ");
		System.out.print(listaCelular);
		
		int indice = id;
		
		
		listaCelular.remove(indice);
		
		id = indice;
	}
	
	public static void listarTodos() {
		listaCelular.forEach(c -> {
			c.imprimir();
			System.out.println();
			
		});
		
	}
	
	public static void listarComFiltro(Tipo tipo) {
		
		listaCelular.stream()
		.filter(b -> b.getSistemaOpercaional().getTipo().equals(tipo))
		.sorted((b1, b2) -> b1.getMarca().compareTo(b2.getMarca()))
		.forEach(b -> System.out.println("["+listaCelular.indexOf(b)+"] - "+b));
		
	}
	
	public static void listarComFiltro(Cor cor) {
		
		listaCelular.stream()
		.filter(b -> b.getCor().equals(cor))
		.sorted((b1, b2) -> b1.getMarca().compareTo(b2.getMarca()))
		.forEach(b -> System.out.println("["+listaCelular.indexOf(b)+"] - "+b));
		
	}
	
	public static void menu() {
		System.out.println("Menu:");
		System.out.println("1 - Inserir um Celular");
		System.out.println("2 - Excluir um Celular");
		System.out.println("3 - Listar Todos os Celulares");
		System.out.println("4 - Listar Todos com o Filtro Tipo");
		System.out.println("5 - Listar Todos com o Filtro Cor");
		System.out.println("6 - Sair");
		System.out.print("Escolha uma opcao: \n");
	}

}
