
package aula1803_02;
import java.util.Scanner;

public class Aula1803_02 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double nota1 = 0;
        double nota2 = 0;
        
        System.out.println("DIGITE SUA NOTA:");
        nota1 = ler.nextDouble();
        
        
        if(nota1 > 70){
            System.out.println("DIGITE SUA PRESENCA:");
            nota2 = ler.nextDouble();
            if(nota2 > 70){
                System.out.println("APROVADO");
            }
            else{
            System.out.println("reprovado");
            }
        }
        
        else{
            System.out.println("DESLIGADO");
        }
    }
    
}
