package Folha_Pagamento;

public class Endereco {
    private String tipoLogradouro;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cep;

    public Endereco(String tipoLogradouro, String logradouro, String complemento, String bairro, String cep) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "tipoLogradouro='" + tipoLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
