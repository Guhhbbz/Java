package baseconta;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Conta cliente = new Conta();
        
        
        
        cliente.numeroconta = 23451461;
        cliente.agencia = 1004;
        
        System.out.println( "Agencia: " + cliente.agencia);
        System.out.println("Conta: "+cliente.numeroconta);
        System.out.println(cliente.transferir());
        System.out.println(cliente.pagar());
        
        
    }
    
}
