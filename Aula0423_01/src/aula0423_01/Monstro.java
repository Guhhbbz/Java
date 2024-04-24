package aula0423_01;

import java.util.Random;


public class Monstro extends Personagem {

    private final String[] NOMES = {"Troll", "Smile", "Esqueleto","Vampiro","Zumbi","Morcego"};
    private int soco = 2;
    private int chute = 3;
    private int cabecada = 4;
    private String nome;
    private Random gerador = new Random();
    
    public Monstro() {
        super(11);
        int num = gerador.nextInt(NOMES.length); // Gerando numero de 0 a 6
        this.nome = NOMES[num];
    }
    
    @Override
    public void atack(int num) {
    
    }
    
}
