import Services.Internet.Browser;
import Services.Internet.Internet;

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
                    System.out.println("Selecionado a Chamadas");

                }
                case 3 -> {
                    System.out.println("Selecionado o IPod");

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
        }
        System.out.println("Saindo do navegador");

    }

    static void opcaoLigacoes() {

    }

    static void opcaoIphone() {

    }

}