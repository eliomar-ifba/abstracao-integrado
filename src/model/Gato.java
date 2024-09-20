package model;

public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    public Gato(){
        super();
    }

    @Override
    public void emitirSom() {
       System.out.println("MIAU!");
    }

   

    
    
}
