package aula0423_01;

import java.util.Random;


public class Monstro extends Personagem implements Aprimoramento {

    private final String[] NOMES = {"Troll", "Smile", "Esqueleto","Vampiro","Zumbi","Morcego"};
    private int soco = 2; //1
    private int chute = 3; //2
    private int cabecada = 4; //3
    private String nome;
    private Random gerador = new Random();
    
    public Monstro() {
        super(11);
        int num = gerador.nextInt(NOMES.length); // Gerando numero de 0 a 6
        this.nome = NOMES[num];
    }

    @Override
    public String getNome() {
        return this.nome;     
    }
    // Retorna um numero aleatorio entre 1 e 3
    public int numeroAleatorio(){
        return gerador.nextInt(1, 4);// limite é excluido nao vai até 4 (3)
    }
    
    @Override
    public int atack(int num) {
    switch(num) {
        case 1 -> {
            return 2;
        }
        case 2 -> {
           return 2;
        }
        case 3 -> {
            return 3;
        }
        default -> {
            return -1;
        }
    }
        
    }

    @Override
    public void melhorarHp(int contador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void melhorarSoco(int contador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void melhorarChute(int contador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void melhorarChabecada(int contador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
