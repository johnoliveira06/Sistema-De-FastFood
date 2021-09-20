package repositorio.Produto;

import java.util.List;
import model.Produto.Produto;

public interface RepositorioProduto {
    
    void inserirProdutos();
    List<Produto> getAll();
}
