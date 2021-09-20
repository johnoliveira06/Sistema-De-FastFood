package controller;

import repositorio.Cliente.RepositorioCliente;
import repositorio.Cliente.NumeroJaCadastradoException;
import repositorio.Cliente.ClienteNaoCadastradoException;
import model.Cliente.Cliente;
import java.util.List;
import model.Produto.Produto;
import repositorio.Cliente.RepositorioClienteLista;
import repositorio.Produto.RepositorioProduto;
import repositorio.Produto.RepositorioProdutoLista;



public class FastController {
    
    private RepositorioCliente repositorioCliente;
    private RepositorioProduto repositorioProduto;
    private static FastController instance;

    public static FastController getInstance(){
        
        if(instance == null){
            instance = new FastController();
        }
        return instance;
    }
    private FastController() {
        repositorioCliente = new RepositorioClienteLista();
        repositorioProduto = new RepositorioProdutoLista();
    }

    public void inserirCliente(Cliente cliente) throws NumeroJaCadastradoException {
        repositorioCliente.inserirCliente(cliente);
    }
    
    public void alterarCliente(Cliente cliente) throws ClienteNaoCadastradoException {
        repositorioCliente.alterarCliente(cliente);
    }
    
    public Cliente buscarCliente(String numero) throws ClienteNaoCadastradoException {
        return repositorioCliente.buscarCliente(numero);
    }
    
    public void excluirCliente(Cliente cliente) throws ControladorException, ClienteNaoCadastradoException {
            repositorioCliente.deletarCliente(cliente);
        }
    
    public List<Cliente> getAllClientes() {
        return repositorioCliente.getAll();
    }
    
    public void inserirProdutos(){
        repositorioProduto.inserirProdutos();
    }
    public List<Produto> getAllProdutos(){
        return repositorioProduto.getAll();
    }
   
    public void exit() {
        // Nada para fazer
    }

}
