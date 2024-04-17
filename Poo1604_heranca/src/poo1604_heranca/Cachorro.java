
package poo1604_heranca;


public abstract class Cachorro extends Mamifero {
    private String raca;
    private int tamanho;
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo até estourar seus timpanos");
    }
    @Override
    public void amamentar(){
        System.out.println("Leitinho para os filhotes");
    }
    
    public void rolar(){
        
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
