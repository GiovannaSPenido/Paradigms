package Locadora;

import java.util.Scanner;

public class LocadoraController {

    static Categoria[] categorias = new Categoria[5];
    static Unidade[] unidades = new Unidade[3];
    static Veiculo[] veiculos = new Veiculo[10];

    public static void cadastrarCategorias() {
        categorias[0] = new Categoria("ECONOMICO COM AR", 100);
        categorias[1] = new Categoria("ECONOMICO SEDAN C/AR", 150);
        categorias[2] = new Categoria("INTERMEDIARIO", 180);
        categorias[3] = new Categoria("EXECUTIVO", 200);
        categorias[4] = new Categoria("PICK-UP COM AR", 220);
    }

    public static void cadastrarUnidades() {
        unidades[0] = new Unidade("Sao Paulo", "(11)2525-1015", "Pedro Paulo", "pedro@mail.com");
        unidades[1] = new Unidade("Rio de Janeiro", "(21)3258-1000", "Fernanda Silva", "fernanda@mail.com");
        unidades[2] = new Unidade("Belo Horizonte", "(31)3200-8000", "Jorge Freitas", "jorge@mail.com");
    }

    public static void cadastrarVeiculos() {
        veiculos[0] = new Veiculo("AAA-1000", "XPTO1000", 2020, categorias[0], unidades[0]);
        veiculos[1] = new Veiculo("BBB-2000", "XPTO2000", 2021, categorias[1], unidades[0]);
        veiculos[2] = new Veiculo("CCC-3000", "XPTO3000", 2021, categorias[2], unidades[0]);
        veiculos[3] = new Veiculo("DDD-4000", "XPTO4000", 2022, categorias[4], unidades[1]);
        veiculos[4] = new Veiculo("EEE-5000", "XPTO5000", 2023, categorias[3], unidades[1]);
        veiculos[5] = new Veiculo("FFF-6000", "XPTO6000", 2020, categorias[4], unidades[1]);
        veiculos[6] = new Veiculo("GGG-7000", "XPTO7000", 2019, categorias[2], unidades[1]);
        veiculos[7] = new Veiculo("HHH-8000", "XPTO8000", 2021, categorias[1], unidades[2]);
        veiculos[8] = new Veiculo("III-9000", "XPTO9000", 2019, categorias[2], unidades[2]);
        veiculos[9] = new Veiculo("JJJ-1100", "XPTO1000", 2021, categorias[3], unidades[2]);
    }

    public static void cadastrarVeiculosNasUnidades() {
        unidades[0].addVeiculo(veiculos[0]);
        unidades[0].addVeiculo(veiculos[1]);
        unidades[0].addVeiculo(veiculos[2]);
        unidades[1].addVeiculo(veiculos[3]);
        unidades[1].addVeiculo(veiculos[4]);
        unidades[1].addVeiculo(veiculos[5]);
        unidades[1].addVeiculo(veiculos[6]);
        unidades[2].addVeiculo(veiculos[7]);
        unidades[2].addVeiculo(veiculos[8]);
        unidades[2].addVeiculo(veiculos[9]);
    }

    public static void loadData() {
        cadastrarCategorias();
        cadastrarUnidades();
        cadastrarVeiculos();
        cadastrarVeiculosNasUnidades();
    }

    public static Veiculo getVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlacaVeiculo().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public static Unidade getUnidade(String nome) {
        for (Unidade unidade : unidades) {
            if (unidade.getEndereco().equalsIgnoreCase(nome)) {
                return unidade;
            }
        }
        return null;
    }

    public static void transferirVeiculo(String placa, String unidade) {
        Veiculo veiculo = getVeiculo(placa);
        Unidade unidadeOrigem;
        Unidade unidadeDestino = getUnidade(unidade);
        if (veiculo == null) {
            System.out.println("Veiculo nao encontrado.");
        } else if (unidadeDestino == null) {
            System.out.println("Unidade nao encontrada");
        } else {
            if (unidadeDestino.addVeiculo(veiculo)) {
                unidadeOrigem = veiculo.getUnidadeVeiculo();
                unidadeOrigem.removeVeiculo(placa);
                veiculo.setUnidadeVeiculo(unidadeDestino);
                System.out.println("Veiculo Transferido com sucesso para unidade: " + unidadeDestino.getEndereco());
            } else {
                System.out.println("Nao foi possivel transferir o veiculo.");
            }
        }
    }

    public static int menuPrincipal() {
        int op;
        Scanner in = new Scanner(System.in);
        System.out.println("\n============ MENU PRINCIPAL ============");
        System.out.println("01 - Listar Categorias");
        System.out.println("02 - Listar Unidades");
        System.out.println("03 - Listar Veiculos");
        System.out.println("04 - Listar Veiculos por Unidade");
        System.out.println("05 - Transferir veiculos entre Unidades");
        System.out.println("=========================================");
        System.out.print("Digite uma opçao (-1 para sair): ");
        op = in.nextInt();
        return op;
    }

    public static void menuSecundario(int op) {
        Scanner in = new Scanner(System.in);
        switch (op) {
            case 1:
                System.out.println("========== CATEGORIAS =============================");
                for (Categoria categoria : categorias) {
                    System.out.println(categoria);
                }
                break;
            case 2:
                System.out.println("========== UNIDADES =============================");
                for (Unidade unidade : unidades) {
                    System.out.println(unidade);
                }
                break;
            case 3:
                System.out.println("========== VEICULOS =============================");
                for (Veiculo veiculo : veiculos) {
                    System.out.println(veiculo);
                }
                break;
            case 4:
                System.out.println("========== VEICULOS POR UNIDADE =============================");
                System.out.println("Digite o nome da unidade:");
                String nomeUnidade = in.nextLine();
                Unidade unidade = getUnidade(nomeUnidade);
                if (unidade != null) {
                    unidade.printVeiculosUnidade();
                } else {
                    System.out.println("Unidade nao encontrada.");
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("========== TRANSFERIR VEICULOS ENTRE UNIDADES =============================");
                System.out.println("Digite a placa do veiculo a ser transferido:");
                String placa = in.nextLine();
                System.out.println("Digite o nome da unidade de destino:");
                String unidadeDestino = in.nextLine();
                transferirVeiculo(placa, unidadeDestino);
                break;
            default:
                if (op >= 0)
                    System.out.println("Opcao Invalida.");
                else
                    System.out.println("Programa encerrado.");
        }
    }

    public static void main(String[] args) {
        int op = 0;
        loadData();
        while (op >= 0) {
            op = menuPrincipal();
            menuSecundario(op);
        }
    }
}

