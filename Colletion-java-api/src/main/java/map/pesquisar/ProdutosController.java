package map.pesquisar;

import java.util.HashMap;
import java.util.Map;

public class ProdutosController {
    private Map<Long,produtos> produtoList;
    public ProdutosController() {
        produtoList = new HashMap<>();
    }

    public void adicionarProduto(Long cod,String nome, double preco, int quantidade){
        produtoList.put(cod, new produtos(nome,preco,quantidade));
    }
    public void exibirList(){
        System.out.println(produtoList);
    }
    public double calcularTotal(){
        double total = 0d;
        for(produtos produto : produtoList.values()){
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public produtos exibirProdutoCaro(){
        produtos Produtocaro = null;
        double produtoMaior = Double.MIN_VALUE;
        for(produtos produto : produtoList.values()){
            if(produto.getPreco() > produtoMaior){
                Produtocaro = produto;
            }
        }
        return Produtocaro;
    }

    public produtos exibirProdutoBarato(){
        produtos produtoBarato = null;
        double produtoMenor = Double.MAX_VALUE;
        for(produtos produto : produtoList.values()){
            if(produto.getPreco() < produtoMenor){
                produtoMenor = produto.getPreco(); // Atualiza o menor preço
                produtoBarato = produto; // Atualiza o produto mais barato
            }
        }
        return produtoBarato;
    }

    public static void main(String[] args) {
        ProdutosController produtosController = new ProdutosController();
        produtosController.adicionarProduto(1L, "Fosforo", 1d, 2);
        produtosController.adicionarProduto(2L, "Isqueiro", 2d, 6);
        produtosController.adicionarProduto(3L, "Caixas", 2.2d, 4);
        produtosController.exibirList();
        produtosController.exibirProdutoBarato();
        System.out.println("Total: " +produtosController.calcularTotal());
        System.out.println("Produto mais caro "+produtosController.exibirProdutoCaro());
        System.out.println("Produto mais barato "+produtosController.exibirProdutoBarato());

    }
}
