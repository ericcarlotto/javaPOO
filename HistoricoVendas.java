import java.util.ArrayList;

public class HistoricoVendas {

	private ArrayList<Venda> vendas;

	public HistoricoVendas(){
		vendas = new ArrayList<Venda>();
	}

	public int getVendas() {
		return vendas.size();
	}

	public boolean cadastraVendas(Venda venda) {
		vendas.add(venda);
		return true;
	}

	public Venda getVenda(int nro) {
		return vendas.get(nro);
	}

}
