package model.Cliente;


public class Cliente {
    
    private String nome;
    private String numero;
    private String endereco;
    private String cep;

    public Cliente(String nome, String numero, String endereco, String cep) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
        this.cep = cep;
    }
    public Cliente(String nome){
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
