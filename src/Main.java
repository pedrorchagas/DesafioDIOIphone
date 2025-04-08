import Services.Internet.Browser;
import Services.Internet.Internet;
import Services.Ligacoes.Ligacoes;
import Services.Ligacoes.Phone;
import Services.Musicas.IPod;
import Services.Musicas.Musicas;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja muito bem-vindo ao Iphone!!!");
        while (true) {
            System.out.println("Qual serviço gostaria de acessar?");
            System.out.println("Opção 1 - Navegador");
            System.out.println("Opção 2 - Chamadas");
            System.out.println("Opção 3 - IPod");
            System.out.println("Opção 4 - Desligar Iphone");
            int opcao = scanner.nextInt();
            if (opcao == 4) break;
            switch (opcao){
                case 1 -> {
                    opcaoNavegador(scanner);
                }
                case 2 -> {
                    opcaoLigacoes(scanner);

                }
                case 3 -> {
                    opcaoIpod(scanner);

                }
                default -> System.out.println("Escreva uma opção válida!");

            }
        }
        System.out.println("Desligando Iphone, até mais!!!");


    }

    static void opcaoNavegador(Scanner scanner){

        Browser navegador = new Internet();

        System.out.println("Selecionado o Navegador");

        while (true) {
            System.out.println("O que gostaria de realizar no navegador?");
            System.out.println("Opção 1 - Abrir página");
            System.out.println("Opção 2 - Fechar página");
            System.out.println("Opção 3 - Recarregar página");
            System.out.println("Opção 4 - Sair do navegador");
            int opcao = scanner.nextInt();
            if (opcao == 4) break;


            switch (opcao) {
                case 1 -> {
                    navegador.novaPagina();
                }
                case 2 -> {
                    navegador.fecharPagina();
                }
                case 3 -> {
                    navegador.recarregarPagina();
                }
                default -> System.out.println("Selecione uma opção válida!!");
            }
            System.out.println("\n\n");
        }
        System.out.println("Saindo do navegador");

    }

    static void opcaoLigacoes(Scanner scanner) {
        Phone ligacao = new Ligacoes();

        System.out.println("Selecionado o Telefone");

        while (true) {
            String estadoLigacao;
            if (ligacao.getLigacao()) estadoLigacao = "Em ligação"; else estadoLigacao = "Fora de ligação";
            System.out.println("O que gostaria de realizar no navegador?");
            System.out.println("Estado ligação: " + estadoLigacao + "\n");
            System.out.println("Opção 1 - Realizar ligação");
            System.out.println("Opção 2 - Desligar ligação");
            System.out.println("Opção 3 - Selecionar Numero");
            System.out.println("Opção 4 - Contato atual");
            System.out.println("Opção 5 - Sair\n");

            int opcao = scanner.nextInt();
            if (opcao == 5) break;


            switch (opcao) {
                case 1 -> {
                    //
                    if (Objects.equals(ligacao.getContato(), "")) {
                        System.out.println("Selecione um número de telefone.");
                    } else {
                        ligacao.realizarLigacao();
                    }
                }
                case 2 -> {
                    if (ligacao.getLigacao()) {
                        ligacao.desligarLigacao();
                    } else {
                        System.out.println("Esteja em uma ligação para poder desligar");
                    }
                }
                case 3 -> {
                    System.out.println("Escreva um número de telefone: ");
                    scanner.nextLine();
                    String numero = scanner.nextLine();
                    ligacao.selecionarContato(numero);
                }
                case 4 -> {
                    System.out.println("Contato atual: " + ligacao.contatoAtual());
                }
                default -> System.out.println("Selecione uma opção válida!!");
            }
            System.out.println("\n\n");
        }
        System.out.println("Saindo do navegador");
    }

    static void opcaoIpod(Scanner scanner) {
        IPod musicas = new Musicas();

        System.out.println("Selecionado o Telefone");

        while (true) {
            System.out.println("O que gostaria de realizar no ipod?");
            System.out.println("Opção 1 - Tocar musica");
            System.out.println("Opção 2 - parar musica");
            System.out.println("Opção 3 - Selecionar musica");
            System.out.println("Opção 4 - Sair");

            int opcao = scanner.nextInt();
            if (opcao == 4) break;

            switch (opcao) {
                case 1 -> {
                    if (musicas.getMusic() != null && !musicas.getStateMusic()) {
                        musicas.tocarMusica();
                    } else {
                        System.out.println("Escolha uma música antes de colocar para tocar ou ela já está tocando!");
                    }

                }
                case 2 -> {
                    if (musicas.getMusic() != null && musicas.getStateMusic()) {
                        musicas.pararMusica();
                    } else {
                        System.out.println("Escolha uma música antes de parar ela ou ela já está parada!");
                    }

                }
                case 3 -> {
                    System.out.println("Escreva o nome da música");
                    scanner.nextLine();
                    String musica = scanner.nextLine();
                    musicas.selecionarMusica(musica);
                }
                default -> System.out.println("Escreva uma opção válida!!!");
            }


        }

    }

}