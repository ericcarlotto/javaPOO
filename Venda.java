import java.util.ArrayList;

public class Venda {

	private int numero;
	private ArrayList<ItemDeVenda> itens;

	public Venda(int numero){
		this.numero = numero;
		itens = new ArrayList<ItemDeVenda>();
	}

	public int getNumero() {
		return numero;
	}

	public double getSubtotal() {
		double valorTotal=0;
		for(ItemDeVenda it: itens){
			valorTotal += it.getValorUnitarioVenda();
		}
		return valorTotal;
	}

	public double getImposto() {
		return 0.2;
	}

	public double getDesconto() {
		return 0.05;
	}

	public double getValorVenda() {
		double vendaTot = (this.getSubtotal() + (this.getSubtotal()*this.getImposto())) - (this.getSubtotal()*this.getDesconto());
		return vendaTot;
	}

	public boolean insereItem(ItemDeVenda item) {
		this.itens.add(this.getNumero(), item);
		return true;
	}

	public ItemDeVenda getItem(int nro) {
		ItemDeVenda itemSelect = itens.get(nro);
		return itemSelect;
	}

	public int getQtdadeItens() {
		return itens.size();
	}

}
