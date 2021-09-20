package repositorio.Cliente;

import model.Cliente.Cliente;
import java.util.ArrayList;
import java.util.List;

public class RepositorioClienteLista implements RepositorioCliente {
    
    List<Cliente> clientes;

    public RepositorioClienteLista() {
        clientes = new ArrayList<>();
    }
    
    @Override
    public void inserirCliente(Cliente cliente) throws NumeroJaCadastradoException {
        try {
            buscarCliente(cliente.getNumero());
            throw new NumeroJaCadastradoException();
        } catch (ClienteNaoCadastradoException ex) {
            clientes.add(cliente);
        }
    }
    
    @Override
    public void alterarCliente(Cliente cliente) {
        // Em memória, não há necessidade de atualizar objeto
    }
    
    @Override
    public void deletarCliente(Cliente cliente) throws ClienteNaoCadastradoException {
        if (! clientes.remove(cliente)) {
            throw new ClienteNaoCadastradoException();
        }
    }
    
    @Override
    public Cliente buscarCliente(String numero) throws ClienteNaoCadastradoException {
        
        for (Cliente cliente : clientes) {
            if (cliente.getNumero().equals(numero)) {
                return cliente;
            }
        }
        throw new ClienteNaoCadastradoException();
        
    }

    @Override
    public List<Cliente> getAll() {
        return clientes;
    }

}
