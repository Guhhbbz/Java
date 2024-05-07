package aula0605_02;
import java.util.Scanner;

public class aula005_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a1;
        double a2;
        double a3;
        
        System.out.println("Digite sua nota (A1)");
        a1 = ler.nextDouble()*3;
        if(a1 < 0 || a1 > 30){
            System.out.println("Nota invalida");
        }else{
            System.out.println("Digite sua nota (A2)");
            a2 = ler.nextDouble()*3;
            if(a2 < 0 || a2 > 30){
                System.out.println("Nota invalida");
            }else{
                System.out.println("Digite sua nota (A3)");
                a3 = ler.nextDouble()*4;
                if(a3 < 0 || a3 > 40){
                    System.out.println("Nota invalida");
                }else{
                   double nf = a1+a2+a3;
                   if(nf >= 70){
                       System.out.println("Digite a quantidade de faltas");
                       int faltas = ler.nextInt();
                       int presenca = 60 - faltas;
                       
                       if(presenca < 48){
                           System.out.println("Reprovado");
                       }else{
                           presenca = presenca * 100 / 60;
                           System.out.println("Nota final: "+(nf*0.1));
                           System.out.println(presenca+"%"+" de frenquencia ");
                           System.out.println("Aprovado");
                       }
                   }else{
                       System.out.println("Reprovado");
                   }
                }
            }
        }
        
    }
    
}
