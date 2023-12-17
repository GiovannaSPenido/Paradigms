package Locadora;

public class Unidade {

    private String endereco;
    private String telefone;
    private String contato;
    private String eMail;
    private Veiculo veiculos[];
    private int totalVeiculos;
    private int capMaxVeiculos = 5;

    public String getEndereco() {
        return endereco;
    }

    public Unidade(String endereco, String telefone, String contato, String eMail) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.contato = contato;
        this.eMail = eMail;
        this.veiculos = new Veiculo[capMaxVeiculos];
        this.totalVeiculos = 0;
    }

    public boolean addVeiculo(Veiculo v) {
        if (totalVeiculos < capMaxVeiculos) {
            veiculos[totalVeiculos] = v;
            totalVeiculos++;
            System.out.println("Veiculo inserido com sucesso.");
            return true;
        }
            System.out.println("Unidade com capacidade de veiculos esgotada.");
            return false;
    }

    public int getVeiculo(String placa) {
        for (int i = 0; i < totalVeiculos; i++) {
            if (veiculos[i].getPlacaVeiculo().equalsIgnoreCase(placa)) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeVeiculo(String placa) {
        int pos = getVeiculo(placa);
        if (pos >= 0 && pos < capMaxVeiculos) {
            if (pos < totalVeiculos - 1) {
                for (int i = pos; i < totalVeiculos - 1; i++) {
                    veiculos[i] = veiculos[i + 1];
                }
            }
            totalVeiculos--;
            System.out.println("Veiculo removido com sucesso.");
            return true;
        }
        System.out.println("Veiculo nao encontrado.");
        return false;
    }

    public void printVeiculosUnidade() {
        if(totalVeiculos == 0){
            System.out.println("Unidade nao possui veiculos.");
        } else {
            for (int i = 0; i < totalVeiculos; i++)
                System.out.println(veiculos[i]);
        }
    }

    @Override
    public String toString() {
        return "Unidade: " + endereco +
                ", fone:" + telefone +
                ", contato: " + contato +
                ", eMail: " + eMail;
    }
}
