package estudodirigido;

import java.util.ArrayList;

public class Placar {

    private ArrayList<Jogador> ranking;

    public Placar (){
        ranking = new ArrayList<>();
    }

    public void adicionarJogador(Jogador j){
        ranking.add(j);
    }

    public void mostrarRanking(){
        System.out.println("Ranking: ");
        for(int i = 0; i < ranking.size(); i++){
            Jogador j = ranking.get(i);
            System.out.println(j.getNome() + " pontuação " + j.getPontuacao());
        }
    }
}
