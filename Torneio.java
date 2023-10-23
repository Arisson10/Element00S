package Torneio;

import Criaturas.Criatura;
import Menus.MenuDeAtaque;
import Menus.Menu;
import Menus.ProximoBatalhaMenu;

import java.util.ArrayList;
import java.util.Random;

public class Batalha {
    private MenuDeAtaque menuDeAtaque = new MenuDeAtaque();
    private Menu proximoBatalhaMenu = new ProximoBatalhaMenu();
    private Random rand = new Random();
    private FluxoDeJogo fluxoDeJogo = new FluxoDeJogo();
    private boolean proximaBatalha = true;

    public void realizarBatalha(ArrayList<Criatura> criaturasNaoEscolhidas, Criatura criaturaEscolhida, Torneio torneio) {
        int vidaCriaturaEscolhida = criaturaEscolhida.getPontosDeVida();
        for (int i = 0; i < criaturasNaoEscolhidas.size(); i++) {
            if (fluxoDeJogo.verificarVelocidade(criaturasNaoEscolhidas.get(i), criaturaEscolhida)) {
                do {
                    menuDeAtaque.exibirMenu();
                    switch (menuDeAtaque.getOpcao()) {
                        case 3:
                            menuDeAtaque.sairDoPrograma(torneio);
                            break;
                        default:
                            fluxoDeJogo.ataqueDoJogador(menuDeAtaque.getOpcao(), criaturasNaoEscolhidas.get(i), criaturaEscolhida);
                    }

                    if (fluxoDeJogo.verificarPontosDeVida(criaturasNaoEscolhidas.get(i))) {
                        System.out.println("\nParabéns, você venceu a batalha :)");
                        if (criaturasNaoEscolhidas.size() - 1 == i) {
                            System.out.println("\nVocê é o grande campeão do torneio ElementOOPs");
                        }
                        proximoBatalhaMenu.exibirMenu();
                        criaturaEscolhida.setPontosDeVida(vidaCriaturaEscolhida);
                        break;
                    }

                    fluxoDeJogo.ataqueOponente(rand.nextInt((2 - 1) + 1) + 1, criaturasNaoEscolhidas.get(i), criaturaEscolhida);

                    if (fluxoDeJogo.verificarPontosDeVida(criaturaEscolhida)) {
                        System.out.println("\nInfelizmente você foi derrotado :( ...");
                        this.proximaBatalha = false;
                        break;
                    }

                } while (criaturasNaoEscolhidas.get(i).getPontosDeVida() > 0 || criaturaEscolhida.getPontosDeVida() > 0);
            } else {
                do {
                    fluxoDeJogo.ataqueOponente(rand.nextInt((2 - 1) + 1) + 1, criaturasNaoEscolhidas.get(i), criaturaEscolhida);

                    if (fluxoDeJogo.verificarPontosDeVida(criaturaEscolhida)) {
                        System.out.println("\nInfelizmente você foi derrotado :( ...");
                        this.proximaBatalha = false;
                        break;
                    }

                    menuDeAtaque.exibirMenu();
                    switch (menuDeAtaque.getOpcao()) {
                        case 3:
                            menuDeAtaque.sairDoPrograma(torneio);
                            break;
                        default:
                            fluxoDeJogo.ataqueDoJogador(menuDeAtaque.getOpcao(), criaturasNaoEscolhidas.get(i), criaturaEscolhida);
                    }

                    if (fluxoDeJogo.verificarPontosDeVida(criaturasNaoEscolhidas.get(i))) {
                        System.out.println("\nParabéns, você venceu a batalha :)");
                        if (criaturasNaoEscolhidas.size() - 1 == i) {
                            System.out.println("\nVocê é o grande campeão do torneio ElementOOPs");
                        }
                        proximoBatalhaMenu.exibirMenu();
                        criaturaEscolhida.setPontosDeVida(vidaCriaturaEscolhida);
                        break;
                    }

                } while (criaturasNaoEscolhidas.get(i).getPontosDeVida() > 0 || criaturaEscolhida.getPontosDeVida() > 0);
            }

            if (!proximaBatalha) {
                break;
            }

            if (proximoBatalhaMenu.getOpcao() == 2) {
                proximoBatalhaMenu.sairDoPrograma(torneio);
                break;
            }
        }
    }
}