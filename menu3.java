package Menus;

import java.util.Scanner;

public class TournamentMenu extends Menu {

    @Override
    public void displayMenu() {
        do {
            System.out.println("\n---------------------------------------------------");
            System.out.println("|                  Torneio                        |");
            System.out.println("---------------------------------------------------");
            System.out.println("|          Escolha uma das op��es abaixo:         |");
            System.out.println("|          1 - Iniciar Torneio                    |");
            System.out.println("|          2 - Sair do programa                   |");
            System.out.println("---------------------------------------------------");
            setOption(getRead().nextInt());
        } while (getOption() > 2 || getOption() < 1);

    }
}