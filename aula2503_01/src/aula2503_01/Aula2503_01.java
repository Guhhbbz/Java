package aula2503_01;
import java.util.Scanner;

public class Aula2503_01 {

    
    public static void main(String[] args) {
        double nota;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua nota: ");
        nota = ler.nextDouble();
        if(nota >= 7){
            System.out.println("Aprovado");
        } else if((nota >= 5) && (nota < 7)){
            System.out.println("Prova");
        } else{
                    System.out.println("Reprovado");
              }
        
    }
            
        
        
    }
    

