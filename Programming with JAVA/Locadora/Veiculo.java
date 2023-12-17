package Locadora;

class Veiculo {

    private String placaVeiculo;
    private String chassiVeiculo;
    private int anoVeiculo;
    private Categoria categoriaVeiculo;
    private Unidade unidadeVeiculo;

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    public void setUnidadeVeiculo(Unidade unidadeVeiculo) {
        this.unidadeVeiculo = unidadeVeiculo;
    }
    public Unidade getUnidadeVeiculo() {
        return unidadeVeiculo;
    }

    public Veiculo(String placaVeiculo, String chassiVeiculo, int anoVeiculo, Categoria categoriaVeiculo, Unidade unidadeVeiculo) {
        this.placaVeiculo = placaVeiculo;
        this.chassiVeiculo = chassiVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.categoriaVeiculo = categoriaVeiculo;
        this.unidadeVeiculo = unidadeVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo " +
                "placa: " + placaVeiculo +
                ", chassi: " + chassiVeiculo +
                ", ano: " + anoVeiculo +
                ", categoria: " + categoriaVeiculo.getNomeDaCategoria() +
                ", unidade: " + unidadeVeiculo.getEndereco();
    }
}

