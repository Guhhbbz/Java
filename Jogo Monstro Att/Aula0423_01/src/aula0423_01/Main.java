package aula0423_01;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Objetivo --> Vencer 50 monstros
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        Jogador player = new Jogador(tc.next());
        
        
        //Criando um vertor de monstros
        Monstro[] m = new Monstro[50];
        
        //Aqui ainda temos que colocar o aprimoramento nos monstros
        
        for (int i = 0; i < m.length; i++) {
            m[i] = new Monstro();
        }
        
        System.out.println(player.getNome()+ "\tHP:"+ player.getHp());
        System.out.println(m.getNome() + "\tHP:" + m.getHp());
        
        //O jogador causa um dano ao monstro
        int ataqueJogador = player.pegarAtaque(tc);
        int danoJogador = player.atack(ataqueJogador);
        player.causarDano(danoJogador, m);
        
        //O monstro causa um dano ao jogador
        int ataqueMonstro = m.numeroAleatorio();
        int danoMonstro = m.atack(ataqueMonstro);
        m.causarDano(danoMonstro, player);
        
        System.out.println(player.getNome()+ "\tHP:"+ player.getHp());
        System.out.println(m.getNome() + "\tHP:" + m.getHp());
        
    }
}
