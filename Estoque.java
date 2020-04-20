import java.util.ArrayList;

public class Estoque {

    private ArrayList<ItemDeEstoque> itens;

    public Estoque() {
        itens = new ArrayList<ItemDeEstoque>();
    }

    public ArrayList<ItemDeEstoque> getEstoque(){
        return this.itens;
    }
    
    // retorna a quantidade de produtos diferentes no estoque
    public int getQuantidadeProdutos(){
        return itens.size();
    }

    // cadastra um produto no estoque
    public boolean cadastraProduto(Produto produto, int estoqueInicial){
        ItemDeEstoque item = new ItemDeEstoque (produto, estoqueInicial);
        return itens.add(item);
    }

    // retorna a quantidade de itens de um produto em estoque
    public int getQuantidadeEstoque(int codigo){
        for (ItemDeEstoque it: itens){
            if (it.getProduto().getCodigo() == codigo){
                return it.getQuantidade();
            }
        }
        return -1;
    }

    public Produto getProduto(int codigo) {
        for (ItemDeEstoque it: itens){
            if (it.getProduto().getCodigo() == codigo){
                return it.getProduto();
            }
        }
        return null;
    }
    
    public int baixaEstoque(int codigo, int quantidade){
        for (ItemDeEstoque it: itens){
           if (it.getProduto().getCodigo() == codigo){
               it.baixaEstoque(quantidade);
           }
       }
       return -1;
   }

   public int reposicaoEstoque(int codigo, int quantidade){
       for (ItemDeEstoque it: itens){
           if (it.getProduto().getCodigo() == codigo){
               it.reposicaoEstoque(quantidade);
           }
       }
       return -1;
   }
    
}