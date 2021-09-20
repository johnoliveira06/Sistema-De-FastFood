package repositorio.Cliente;

import javax.swing.JOptionPane;

public class ClienteNaoCadastradoException extends Exception {

    public ClienteNaoCadastradoException() {
        super("Cliente não cadastrado!");
    }
    
    
}
