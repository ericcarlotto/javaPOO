public class App{
    public static void main(String args[]) {
        // Instancia o controle de estoque
        Estoque e = new Estoque();

        // Cadastra um produto
        e.cadastraProduto(new Produto(1233, "Geladeira", 2500.0), 100);
        e.cadastraProduto(new Produto(4461, "Ventilador", 174.0), 100);
        e.cadastraProduto(new Produto(6765, "Fogão", 879.0), 100);
        e.cadastraProduto(new Produto(3943, "Ferro de passar", 225.0), 100);


        // Obtem um produto
        Produto p = e.getProduto(1233);
        System.out.println(p);
        Produto g = e.getProduto(4461);
        System.out.println(g);
        Produto j = e.getProduto(6765);
        System.out.println(j);
        Produto k = e.getProduto(3943);
        System.out.println(k);

        //Instanciando 4 Itens de Venda
        ItemDeVenda geladeira = new ItemDeVenda(p, 1, 2500.0);
        ItemDeVenda ventilador = new ItemDeVenda(g, 3, 522.0);
        ItemDeVenda fogao = new ItemDeVenda(j, 1, 879.0);
        ItemDeVenda ferroDePassar = new ItemDeVenda(k, 2, 450.0);

        //Instancia uma nova venda
        Venda v = new Venda(32);

        //Inserindo os 4 itens na venda v
        v.insereItem(geladeira);
        v.insereItem(ventilador);
        v.insereItem(fogao);
        v.insereItem(ferroDePassar);

        System.out.println(v.getSubtotal());
        System.out.println(v.getDesconto());
        System.out.println(v.getImpostoValor());
        System.out.println(v.getValorVenda());


    }
}