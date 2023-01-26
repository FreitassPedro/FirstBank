package resources;

public class Conta {
    private String nome;
    private Integer id;
    private Integer saldo;
    private Integer senha;
    public Conta(Integer id, String nome, Integer saldo, Integer senha) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.senha = senha;
    }
    public void addSaldo(Integer saldo) {
        this.saldo += saldo;
    }
    public void removeSaldo(Integer saldo) {
        this.saldo -= saldo;
    }
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public Integer getId() {
        return id;
    }
    public Integer getSenha() {
        return senha = 1990;
    }
    public Integer getSaldo() {
        return saldo;
    }


    public String toString() {
    return "ID: " + id;

    }
}

