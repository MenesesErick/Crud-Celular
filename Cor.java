package aplicacao;

public enum Cor {
	
	PRETO(1),
	BRANCO(2),
	AZUL(3);
	
	private int id;
	

	

	private Cor(int id) {
		this.id = id;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static Cor valueOf(int opcao) {
		for (Cor corCelular : Cor.values()) {
			if (corCelular.getId() == opcao) {
				return corCelular;
			}
		}
		return null;
	}

}
