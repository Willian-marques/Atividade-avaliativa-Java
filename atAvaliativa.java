
import java.util.ArrayList;
import java.util.Scanner;

// Classe abstrata
abstract class Veiculo {

    private int id;
    private String marca;
    private int ano;

    public Veiculo(int id, String marca, int ano) {
        this.id = id;
        this.marca = marca;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public abstract void exibirDados();
}

// Subclasse Ônibus
class Onibus extends Veiculo {

    private int capacidadePassageiros;
    private String tipo;

    public Onibus(int id, String marca, int ano, int capacidadePassageiros, String tipo) {
        super(id, marca, ano);
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipo = tipo;
    }

    public void abrirPortas() {
        System.out.println("Portas do ônibus abertas.");
    }

    public void fecharPortas() {
        System.out.println("Portas do ônibus fechadas.");
    }

    @Override
    public void exibirDados() {
        System.out.println("[Ônibus]");
        System.out.println("ID: " + getId());
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Tipo: " + tipo);
    }
}

// Subclasse Metrô
class Metro extends Veiculo {

    private int numeroVagoes;
    private boolean temArCondicionado;

    public Metro(int numeroVagoes, boolean temArCondicionado, int id, String marca, int ano) {
        super(id, marca, ano);
        this.numeroVagoes = numeroVagoes;
        this.temArCondicionado = temArCondicionado;
    }

    public void embarcarPassageiros(int qtd) {
        System.out.println(qtd + " passageiros embarcados.");
    }

    public void desembarcarPassageiros(int qtd) {
        System.out.println(qtd + " passageiros desembarcados.");
    }

    @Override
    public void exibirDados() {
        System.out.println("[Metrô]");
        System.out.println("ID: " + getId());
        System.out.println("Número de Vagões: " + numeroVagoes);
        System.out.println("Tem ar-condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }
}

// Classe Garagem
class Garagem {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public void listarTodos() {
        for (Veiculo v : veiculos) {
            v.exibirDados();
            System.out.println("-----------");
        }
    }

    public void listarPorTipo() {
        System.out.println("==== Ônibus ====");
        for (Veiculo v : veiculos) {
            if (v instanceof Onibus) {
                v.exibirDados();
                System.out.println("-----------");
            }
        }
        System.out.println("==== Metrôs ====");
        for (Veiculo v : veiculos) {
            if (v instanceof Metro) {
                v.exibirDados();
                System.out.println("-----------");
            }
        }
    }

    public void contarVeiculos() {
        int qtdOnibus = 0;
        int qtdMetro = 0;
        for (Veiculo v : veiculos) {
            if (v instanceof Onibus) {
                qtdOnibus++; 
            }else if (v instanceof Metro) {
                qtdMetro++;
            }
        }
        System.out.println("Total de ônibus: " + qtdOnibus);
        System.out.println("Total de metrôs: " + qtdMetro);
    }

    public Veiculo buscarPorId(int id) {
        for (Veiculo v : veiculos) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }
}

// Classe principal
public class atAvaliativa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garagem garagem = new Garagem();
        int opcao;

        do {
            System.out.println("\n=== Menu de Opções ===");
            System.out.println("1. Cadastrar Ônibus");
            System.out.println("2. Cadastrar Metrô");
            System.out.println("3. Listar todos os veículos");
            System.out.println("4. Listar veículos por tipo");
            System.out.println("5. Executar ação específica");
            System.out.println("6. Mostrar total de veículos por tipo");
            System.out.println("7. Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int idOnibus = scanner.nextInt();

                    System.out.print("Marca: ");
                    String marcaOnibus = scanner.next();

                    System.out.print("Ano: ");
                    int anoOnibus = scanner.nextInt();

                    System.out.print("Capacidade de passageiros: ");
                    int capacidade = scanner.nextInt();

                    System.out.print("Tipo (articulado, convencional, micro-ônibus): ");
                    String tipo = scanner.next();

                    Onibus onibus = new Onibus(idOnibus, marcaOnibus, anoOnibus, capacidade, tipo);
                    garagem.adicionarVeiculo(onibus);

                    System.out.println("Ônibus cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("ID: ");
                    int idMetro = scanner.nextInt();

                    System.out.print("Marca: ");
                    String marcaMetro = scanner.next();

                    System.out.print("Ano: ");
                    int anoMetro = scanner.nextInt();

                    System.out.print("Número de vagões: ");
                    int vagoes = scanner.nextInt();

                    System.out.print("Tem ar-condicionado (true/false): ");
                    boolean ar = scanner.nextBoolean();

                    Metro metro = new Metro(vagoes, ar, idMetro, marcaMetro, anoMetro);
                    garagem.adicionarVeiculo(metro);
                    System.out.println("Metrô cadastrado com sucesso!");
                    break;

                case 3:
                    garagem.listarTodos();
                    break;

                case 4:
                    garagem.listarPorTipo();
                    break;

                case 5:
                    System.out.print("Digite o ID do veículo: ");
                    int idBusca = scanner.nextInt();
                    
                    Veiculo veiculo = garagem.buscarPorId(idBusca);
                    if (veiculo != null) {
                        if (veiculo instanceof Onibus) {
                            ((Onibus) veiculo).abrirPortas();
                        } else if (veiculo instanceof Metro) {
                            System.out.print("Quantos passageiros vão embarcar? ");
                            int qtd = scanner.nextInt();
                            ((Metro) veiculo).embarcarPassageiros(qtd);
                        }
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 6:
                    garagem.contarVeiculos();
                    break;

                case 7:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 7);

        scanner.close();
    }
}
