package Menus;

import Tournament.Tournament;

import java.util.Scanner;

public abstract class Menu {
    private int option;
    private Scanner read = new Scanner(System.in);

    public Menu() {
        setOption(option);
        setRead(read);
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void exitProgram(Tournament tournament) {
        int optionExit;
        System.out.println("Tem certeza que deseja sair do programa ? \n 1 - Sim \n 2 - Não ");
        optionExit = read.nextInt();
        if(optionExit == 1) {
            System.out.println("Encerrando programa...");
            System.exit(0);
        } else {
            tournament.startGame();
        }

    }

    public abstract void displayMenu();

}