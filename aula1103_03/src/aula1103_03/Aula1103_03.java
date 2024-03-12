package aula1103_03;
import java.util.Scanner;


public class Aula1103_03 {

    
    public static void main(String[] args) {
        System.out.println("Digite Sua nota A1: ");
               
        int a1;
        Scanner nota1 = new Scanner(System.in);
        a1 = nota1.nextInt() * 3;
        
        
        
        
        if(a1 > 10){
        System.out.println("NOTA INVALIDA!");
        }
        else{
        System.out.println("A1 = "+ a1);
        
        System.out.println("Digite sua nota A2: ");
        
        int a2 = 0;
        Scanner nota2 = new Scanner(System.in);
        a2 = nota2.nextInt()*3;
        
        
        if(a2 > 10){
        System.out.println("NOTA INVALIDA!");
        }
        else{
        System.out.println("A2 = "+ a2);
        System.out.println("Digite sua nota A3: ");
        
        
        int a3;
        Scanner nota3 = new Scanner(System.in);
        a3 = nota3.nextInt()*4;
        
        
        if(a3 > 10){
        System.out.println("NOTA INVALIDA!");
        }
        else{
        System.out.println("A3 = "+ a3);
        
        System.out.println("Sua nota total e: " + (a1+a2+a3));
        
        }
        
      
        }
        
        
        
        }
        
        
        
        
        
        
    }
    
}
