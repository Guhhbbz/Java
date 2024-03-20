package exemplo01;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        Aluno joao = new Aluno("Joao");
        Aluno ana = new Aluno("Ana");
        
        
        
        System.out.println(ana.nome);
        ana.notaA1 = 30;
        joao.notaA1 = 20;
        System.out.println(ana.verNotaA1());
        System.out.println(joao.verNotaA1());
        System.out.println(joao.estudar());
        
        
    }
}
