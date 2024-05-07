package aula0605_01;
import java.util.Scanner;

public class Aula0605_01 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double nota;
        
        System.out.println("Digite sua nota");
        nota = ler.nextDouble();
        
        if (nota < 0 || nota > 10){
            System.out.println("Nota Invalida");
             
        }else if(nota >= 7 && nota <=10){
            System.out.println("Aprovado");
              }
        else if(nota >= 5 && nota <7){
            System.out.println("Realize a recuperacao");
        }
        else{
            System.out.println("Reprovado");
        }
        
        
        
    }
    
}
