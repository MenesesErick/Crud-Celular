package aplicacao;

import java.util.Objects;
import java.util.Scanner;

public class Celular implements Impressao{
	
	private Integer id;
	private String nome;
	private String Marca;
	private Integer qtdRam;
	
	private Cor cor;
	private SistemaOperacional sistemaOpercaional;
	
	private static Scanner scan = new Scanner(System.in);
	
	
	public Celular(Integer id, String nome, String marca, Integer qtdRam, Cor cor,
			SistemaOperacional sistemaOpercaional) {
		super();
		this.id = id;
		this.nome = nome;
		Marca = marca;
		this.qtdRam = qtdRam;
		this.cor = cor;
		this.sistemaOpercaional = sistemaOpercaional;
	}

	public Celular() {
		
	}

	public static Celular lerDados() {
		Celular celular = new Celular();
		
		try {
			System.out.println("Digite o id do celular");
			celular.setId(scan.nextInt());
			
		} catch (Exception e) {
			System.out.println("Erro!!! Coloque um valor do tipo Inteiro");
			
		}
		
		System.out.println("Digite o Nome do celular");
		celular.setNome(scan.next());
		
		
		System.out.println("Digite a Marca do celular");
		celular.setMarca(scan.next());
		
		try {
			System.out.println("Digite a quantidade de memoria Ram do dispositivo");
			celular.setQtdRam(scan.nextInt());
			
		} catch (Exception e) {
			System.out.println("Erro!!! Coloque um valor do tipo Inteiro");
		}
		
		System.out.println("Insira qual é a cor do celular");
		
			System.out.println("1 - Preto \n2 - Branco \n3 - Azul");
		
		
		celular.setCor(Cor.valueOf(scan.nextInt()));
		
		celular.setSistemaOpercaional(SistemaOperacional.lerDados());
		
		
		return celular;
	}
	
	
	@Override
	public void imprimir() {
		
		System.out.println(this.toString());
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Marca, cor, id, nome, qtdRam, sistemaOpercaional);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Celular other = (Celular) obj;
		return Objects.equals(Marca, other.Marca) && cor == other.cor && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(qtdRam, other.qtdRam)
				&& Objects.equals(sistemaOpercaional, other.sistemaOpercaional);
	}

	@Override
	public String toString() {
		return "Celular [id=" + id + ", nome=" + nome + ", Marca=" + Marca + ", qtdRam=" + qtdRam + ", cor=" + cor
				+ ", sistemaOpercaional=" + sistemaOpercaional + "]";
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public Integer getQtdRam() {
		return qtdRam;
	}


	public void setQtdRam(Integer qtdRam) {
		this.qtdRam = qtdRam;
	}


	public Cor getCor() {
		return cor;
	}


	public void setCor(Cor cor) {
		this.cor = cor;
	}


	public SistemaOperacional getSistemaOpercaional() {
		return sistemaOpercaional;
	}


	public void setSistemaOpercaional(SistemaOperacional sistemaOpercaional) {
		this.sistemaOpercaional = sistemaOpercaional;
	}
	
	

}
