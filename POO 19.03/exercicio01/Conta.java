package baseconta;


public class Conta {
   
   // ATRIBUTOS
    int agencia;
    int numeroconta;
    String transferir;
    String pagar;
    
   // CONSTRUTOR 
    
    
    
    
   // METODOS
    
    String transferir(){
        return"Transferindo";
    }
    String pagar(){
        return"Pagando";
    }
    int verconta(){
        return this.numeroconta;
    }
    int veragencia(){
        return this.agencia;
    }
    
}
