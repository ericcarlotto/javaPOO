import java.util.ArrayList;

public class CatálogoDeProdutos {

	Estoque e = new Estoque();

	public void carregaProdutos() {
		
	}

	public Produto getProdutoPorCodigo(int codigo) {
		return e.getProduto(codigo);
	}

	public ArrayList<ItemDeEstoque> getTodosProdutos() {
		return e.getEstoque();
	}

}
