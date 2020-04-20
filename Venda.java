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
			valorTotal += it.getValorUnitarioVenda()*it.getQuantidade();
		}
		return valorTotal;
	}

	public double getImposto() {
		return 0.25;
	}

	public double getImpostoValor(){
		return this.getSubtotal()*this.getImposto();
	}

	public double getDesconto() {
		if(itens.size()>=10){
			return 0.1;
		}else {
			return 0;
		}
	}

	public double getValorVenda() {
		double subTot = this.getSubtotal();
		double desc = subTot*this.getDesconto();
		double impost = subTot*this.getImposto();
		double valorTotal = subTot - desc + impost;
		return valorTotal;
	}

	public boolean insereItem(ItemDeVenda item) {
		this.itens.add(item);
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
