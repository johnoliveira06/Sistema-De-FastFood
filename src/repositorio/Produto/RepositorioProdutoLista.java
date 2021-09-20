package repositorio.Produto;

import java.util.ArrayList;
import java.util.List;
import model.Produto.Produto;


public class RepositorioProdutoLista implements RepositorioProduto{
    
    List<Produto> produtos;
    
    public RepositorioProdutoLista(){
        produtos = new ArrayList<>();
    }

        Produto produto1 = new Produto(1, "Coxinha", 4);
        Produto produto2 = new Produto(2, "Pastel de queijo", 5);
        Produto produto3 = new Produto(3, "Empada de frango", 5);
        Produto produto4 = new Produto(4, "Batata Frita", 6);
        Produto produto5 = new Produto(5, "X-Salada", 6);
        Produto produto6 = new Produto(6, "X-Burguer", 7);
        Produto produto7 = new Produto(7, "X-Bacon", 8);
        Produto produto8 = new Produto(8, "X-Tudo", 13);
        Produto produto9 = new Produto(9, "Coca-Cola Lata", 4);
        Produto produto10 = new Produto(10, "Coca-Cola 1L", 6);
        Produto produto11 = new Produto(11, "Coca-Cola 2L", 8);
        Produto produto12 = new Produto(12, "Guaraná Antártica 1L", 5);
        Produto produto13 = new Produto(13, "Pudim", 2);
        Produto produto14 = new Produto(14, "Bolo de chocolate", 4);
        Produto produto15 = new Produto(15, "Torta de limão", 4);
        
        @Override
        public void inserirProdutos(){
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);
        produtos.add(produto7);
        produtos.add(produto8);
        produtos.add(produto9);
        produtos.add(produto10);
        produtos.add(produto11);
        produtos.add(produto12);
        produtos.add(produto13);
        produtos.add(produto14);
        produtos.add(produto15);
        }
        
    
    
    @Override
    public List<Produto> getAll() {
        return produtos;
    }
}
