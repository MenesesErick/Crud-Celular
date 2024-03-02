package aplicacao;



public enum Tipo {
	
	IOS(1),
	ANDROID(2);
	
	private int id;
	
	
	public static Tipo valueOf(int opcao) {
		for (Tipo num : Tipo.values()) {
			if (num.getId() == opcao) {
				return num;
			}
		}
		return null;
	}
	
		

	private Tipo(int id) {
		this.id = id;
	
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
