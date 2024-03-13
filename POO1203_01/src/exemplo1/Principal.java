package exemplo1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Aluno joao = new Aluno();
        
        System.out.println(joao.nome);
        System.out.println(joao.notaA1);
        
    }
    
}
