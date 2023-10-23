package Menus;

public class NextBattleMenu extends Menu{

    @Override
    public void displayMenu() {
        do {
            System.out.println("\n---------------------------------------------------");
            System.out.println("|                  Próxima batalha                |");
            System.out.println("---------------------------------------------------");
            System.out.println("|          Escolha uma das opções abaixo:         |");
            System.out.println("|          1 - iniciar a próxima batalha          |");
            System.out.println("|          2 - Sair do programa                   |");
            System.out.println("---------------------------------------------------");
            setOption(getRead().nextInt());
        } while (getOption() < 1 || getOption() > 2);

    }
}