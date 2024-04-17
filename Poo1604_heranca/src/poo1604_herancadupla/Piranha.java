
package poo1604_herancadupla;


public class Piranha implements Presa, Predador {

    @Override
    public void fugir() {
        System.out.println("Fugindo do jacara");
    }

    @Override
    public void cacar() {
        System.out.println("Vim te comer");
    }
    
}
