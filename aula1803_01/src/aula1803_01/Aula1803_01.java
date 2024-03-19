package aula1803_01;
import java.util.Scanner;

public class Aula1803_01 {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double nota;
       double presenca;
       
        System.out.println("Digite a nota: ");
        nota = ler.nextDouble();
        System.out.println("Digite a presenca:");
        presenca = ler.nextDouble();
        
        if((nota >= 70) && (presenca >= 75)){
            System.out.println("Parabens!");
            
        }
        else{
            System.out.println("Reprovado!");
        }
        
        
        
       
        
    }
    
}
