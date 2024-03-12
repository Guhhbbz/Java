package aula1103_02;
import java.util.Scanner;

public class Aula1103_02 {

    
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        
        Scanner ler = new Scanner(System.in);
        
        int idd;
        int ps;
        String nm = new String();
        
        nm = ler.nextLine();
        
        System.out.println("Ola, " + nm);
        
        System.out.println("Digite sua idade: ");
                        
        idd = ler.nextInt();
        
        System.out.println("Obrigado, agora digite seu peso: ");                
        
        ps = ler.nextInt();
        
        System.out.println("Aqui estao suas informacoes: ");
        System.out.println("Nome: "+nm);
        System.out.println("Idade: "+idd);
        System.out.println("Peso: "+ps);
    }
    
}
