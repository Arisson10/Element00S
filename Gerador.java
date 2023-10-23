import java.util.Random;

public class Gerador {
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int pontosvitais;
    
    private Random rand = new Random();

    public Gerador () {
        gerarNumeros();
    } // fim do metodo Gerador

    public void gerarNumeros() {
        poder = rand.nextInt((30 - 10) + 1) + 10;
        ataque = rand.nextInt((15 - 5) + 1) + 5;
        defesa = rand.nextInt((15 - 5) + 1) + 5;
        velocidade = rand.nextInt((10 - 1) + 1) + 1;
        pontosvitais = rand.nextInt((400 - 200) + 1) + 200;

    }//fim do metodo gerarNumeros

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getpontosVitais() {
        return pontosvitais;
    }

    public void setpontosVitais(int pontosvitais) {
        this.pontosvitais = pontosvitais;
    }
}
