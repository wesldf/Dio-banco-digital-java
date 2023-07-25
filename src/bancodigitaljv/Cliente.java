package bancodigitaljv;

public class Cliente {
	private String nome;
	private int rg;
	private String endereco;
	private int telefone;
	
	
	public String getNome() {
		return nome;
	}
	public int getRg() {
		return rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public Cliente(String nome, int rg, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
	}
		
	}
	
	


	
