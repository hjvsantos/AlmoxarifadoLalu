package classesBasicas;

public class Produto {
	
	public String nome;
	public int quantidade;
	public double valorCompraUnidade;
	public double valorVendaUnidade;
	public int quantidadeLimite;
	
	public Produto(String nome, int quantidade, double valorCompraUnidade,
			double valorVendaUnidade, int quantidadeLimite) {
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorCompraUnidade = valorCompraUnidade;
		this.valorVendaUnidade = valorVendaUnidade;
		this.quantidadeLimite = quantidadeLimite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorCompraUnidade() {
		return valorCompraUnidade;
	}

	public void setValorCompraUnidade(double valorCompraUnidade) {
		this.valorCompraUnidade = valorCompraUnidade;
	}

	public double getValorVendaUnidade() {
		return valorVendaUnidade;
	}

	public void setValorVendaUnidade(double valorVendaUnidade) {
		this.valorVendaUnidade = valorVendaUnidade;
	}

	public int getQuantidadeLimite() {
		return quantidadeLimite;
	}

	public void setQuantidadeLimite(int quantidadeLimite) {
		this.quantidadeLimite = quantidadeLimite;
	}
	
	
	
}
