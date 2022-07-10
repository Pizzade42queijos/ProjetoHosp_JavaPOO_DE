package backend;

public abstract class Pessoa {
	private String Nome;
	private int Id;
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}
	public abstract int setIdEmLista();

}
