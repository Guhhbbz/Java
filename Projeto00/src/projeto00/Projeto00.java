
package projeto00;
import java.util.Scanner;

public class Projeto00 {


    public static void main(String[] args) {
        System.out.println("Ola, sou sua calculadora ");
        System.out.println("Digite um numero:");
        Scanner numero1 = new Scanner(System.in);
        int nrm1 = 0;
        nrm1 = numero1.nextInt();
        System.out.println("Seu primeiro numero e: "+nrm1);
        System.out.println("Digite seu segundo numero:");
        Scanner numero2 = new Scanner(System.in);
        int nrm2 = 0;
        nrm2 = numero2.nextInt();
        System.out.println("Seu segundo numero e: "+ nrm2);
        System.out.println("Total: "+(nrm1+nrm2));           
        
        
        
                
    }
    
    
}
