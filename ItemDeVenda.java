public class ItemDeVenda {

	private Produto produto;
	private int quantidade;
	private double valorUnitario;

	public ItemDeVenda(Produto produto, int quantidade, double valorUnitario){
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}


	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValorUnitarioVenda() {
		return valorUnitario;
	}

}
