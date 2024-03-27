package novopacote;

import aula260301.Pessoa;


public class Principal {

    
    public static void main(String[] args) {
       
        Pessoa p1 = new Pessoa("Joao",42);
        Pessoa p2 = new Pessoa("Andre");
        
        
        System.out.println(p1.getIdade());
        System.out.println(p1.getNome());
    }
    
}
