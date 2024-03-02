package aplicacao;

import java.time.LocalDate;

import java.util.Scanner;

public class SistemaOperacional implements Impressao {
	
	private static Scanner scan = new Scanner(System.in);
	private LocalDate dataAtualizacao;
	private String versao;
	
	
	private Tipo tipo;
	
	public SistemaOperacional() {
		
	}
	
	
	public SistemaOperacional(LocalDate dataAtualizacao, String versao, Tipo tipo) {
		super();
		this.dataAtualizacao = dataAtualizacao;
		this.versao = versao;
		this.tipo = tipo;
	}

	public static SistemaOperacional lerDados() {
		SistemaOperacional sistema = new SistemaOperacional();
		
		System.out.println("Inserir Data da Atualizacao do Sistema - Ex.: 2023-12-12");
		sistema.setDataAtualizacao(LocalDate.parse(scan.next()));
		
		System.out.println("Inserir versao do Sistema");
		sistema.setVersao(scan.next());
		
		System.out.println("Inserir o Tipo de Sistema Operacional");
		
		System.out.println("1 - IOS \n2 - ANDROID");
		
		sistema.setTipo(Tipo.valueOf(scan.nextInt()));
		
		return sistema;
		
	}
	
	@Override
	public void imprimir() {
		
		System.out.println(this.toString());
		
	}
	
	

	@Override
	public String toString() {
		return "SistemaOperacional [dataAtualizacao=" + dataAtualizacao + ", versao=" + versao + ", tipo=" + tipo + "]";
	}


	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
}
