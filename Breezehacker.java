public class Breezehacker extends Gerador {

    public Breezehacker () {
        super(); 
    }

    public void mostrarStatus() {
        System.out.println("Status da Criatura:");
        System.out.println("Poder: " + getPoder());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Defesa: " + getDefesa());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Pontos Vitais: " + getpontosVitais());
    }

    public static void main (String[] args) {
        Breezehacker breezehacker = new Breezehacker();
        breezehacker.mostrarStatus();
    }
}