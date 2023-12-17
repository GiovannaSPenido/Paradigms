package Locadora;

class Categoria {

    private String nomeDaCategoria;
    private double valorDiaria;

    public String getNomeDaCategoria() {
        return nomeDaCategoria;
    }

    public Categoria(String nomeDaCategoria, double valorDiaria) {
        this.nomeDaCategoria = nomeDaCategoria;
        this.valorDiaria = valorDiaria;
    }

    double calculaTotalDiarias(int dias) {
        return this.valorDiaria * dias;
    }

    @Override
    public String toString() {
        return "Categoria: " + nomeDaCategoria +
                ", valor diaria: R$ " + String.format("%.2f", valorDiaria);
    }
}

