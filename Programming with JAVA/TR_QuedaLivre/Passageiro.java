package TR_QuedaLivre;

public class Passageiro {

    private String CPF;
    private String Nome;
    private String Endereco;
    private String Horario;
    private int Telefone;
    private int NumPassagem;
    private String NumPoltrona;
    private String NumVoo;

    // Constructor
    public Passageiro(String CPF, String nome, String endereco, String horario, int telefone, int numPassagem,
                      String numPoltrona, String numVoo) {
        this.CPF = CPF;
        this.Nome = nome;
        this.Endereco = endereco;
        this.Horario = horario;
        this.Telefone = telefone;
        this.NumPassagem = numPassagem;
        this.NumPoltrona = numPoltrona;
        this.NumVoo = numVoo;
    }


    // toString
    @Override
    public String toString() {
        return "Passageiro [CPF=" + CPF + ", Nome=" + Nome + ", Endereco=" + Endereco + ", Horario=" + Horario
                + ", Telefone=" + Telefone + ", NumPassagem=" + NumPassagem + ", NumPoltrona=" + NumPoltrona
                + ", NumVoo=" + NumVoo + "]";
    }
}
