package Torneio;

import Criaturas.*;

import java.util.ArrayList;

public class FluxoDeJogo {
    private Criatura stoneDev = new StoneDev();
    private Criatura waveNerd = new WaveNerd();
    private Criatura burnCoder = new BurnCoder();
    private Criatura breezeHacker = new BreezeHacker();

    private ArrayList<Criatura> criaturasNaoEscolhidas = new ArrayList<>();

    public ArrayList<Criatura> getCriaturasNaoEscolhidas() {
        return criaturasNaoEscolhidas;
    }

    public void definirCriaturasNaoEscolhidas(Criatura criaturaEscolhida) {
        criaturasNaoEscolhidas.add(stoneDev);
        criaturasNaoEscolhidas.add(waveNerd);
        criaturasNaoEscolhidas.add(burnCoder);
        criaturasNaoEscolhidas.add(breezeHacker);

        criaturasNaoEscolhidas.removeIf(criatura -> criatura.getCriaturaNome().equals(criaturaEscolhida.getCriaturaNome()));
    }

    public boolean verificarPontosDeVida(Criatura inimigo) {
        return inimigo.getPontosDeVida() < 1;
    }

    public boolean verificarVelocidade(Criatura inimigo, Criatura criaturaJogador) {
        return criaturaJogador.getVelocidade() > inimigo.getVelocidade();
    }

    public void ataqueDoJogador(int opcao, Criatura oponente, Criatura criaturaEscolhida) {
        switch (opcao) {
            case 1:
                criaturaEscolhida.ataqueFisico(oponente);
                break;
            case 2:
                criaturaEscolhida.ataqueElemental(oponente);
                break;
        }
    }

    public void ataqueOponente(int opcao, Criatura oponente, Criatura criaturaEscolhida) {
        switch (opcao) {
            case 1:
                oponente.ataqueFisico(criaturaEscolhida);
                break;
            case 2:
                oponente.ataqueElemental(criaturaEscolhida);
                break;
        }
    }
}