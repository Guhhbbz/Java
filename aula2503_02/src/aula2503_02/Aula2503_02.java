package aula2503_02;
import java.util.Scanner;

public class Aula2503_02 {

    
    public static void main(String[] args) {
        double A1 = 1;
        double A2 = 7;
        double A3 = 7;
        int opcoes;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escolha uma das opcoes");
        System.out.println("(1) Adicionar nota A1");
        System.out.println("(2) Adicionar nota A2");
        System.out.println("(3) Adicionar nota A3");
        
        opcoes = ler.nextInt();
        
        if(opcoes == 1){
            System.out.println("Digite a nota A1");
            A1 = ler.nextInt();
            System.out.println("Nota Registrada");
        } else if(opcoes == 2){
            System.out.println("Digite a nota A2");
            A2 = ler.nextInt();
            System.out.println("Nota Registrada");
        } else if(opcoes == 3){
            System.out.println("Digite a nota A3");
            A3 = ler.nextInt();
            System.out.println("Nota Registrada");
        } else{
            System.out.println("Opcao invalida");
        }
        
        double notafinal = 3*A1+3*A2+4*A3;
        
        if(notafinal >= 70){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
        
        
        
    }
    
}
