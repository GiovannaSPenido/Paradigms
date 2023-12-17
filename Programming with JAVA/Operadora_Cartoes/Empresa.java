package Operadora_Cartoes;

public class Empresa {
    private final String nome;
    private final String cnpj;
    private final int inscricao;

    public Empresa(String nome, String cnpj, int inscricao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.inscricao = inscricao;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", inscricao=" + inscricao +
                '}';
    }
}
