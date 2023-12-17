package Operadora_Cartoes;

public class Cliente {
    private final String nome;
    private final String documento;
    private final String endereco;
    private final String email;

    public Cliente(String nome, String documento, String endereco, String email) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
