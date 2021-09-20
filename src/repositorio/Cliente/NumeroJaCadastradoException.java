package repositorio.Cliente;

import javax.swing.JOptionPane;

public class NumeroJaCadastradoException extends Exception {

    public NumeroJaCadastradoException() {
        super("Número já cadastrado!");
    }
     
}
