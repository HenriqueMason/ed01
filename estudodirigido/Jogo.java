package estudodirigido;

import java.util.Random;

public class Jogo {

    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador, int numeroSecreto) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    public String jogar(int tentativa){
        jogador.incremetarTentativa();

        if(tentativa == numeroSecreto){
            System.out.println("Acertou");
            jogador.atualizarPontuacao();
        } else if(tentativa > numeroSecreto){
            System.out.println("Numero muito alto");
        } else {
            System.out.println("Numero muito baixo");
        }
    }
}