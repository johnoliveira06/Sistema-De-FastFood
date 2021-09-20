package repositorio.Cliente;

import model.Cliente.Cliente;
import java.util.List;

public interface RepositorioCliente {

    void inserirCliente(Cliente cliente) throws NumeroJaCadastradoException;

    void alterarCliente(Cliente cliente) throws ClienteNaoCadastradoException;

    void deletarCliente(Cliente cliente) throws ClienteNaoCadastradoException;

    Cliente buscarCliente(String numero) throws ClienteNaoCadastradoException;

    List<Cliente> getAll();
    
}
