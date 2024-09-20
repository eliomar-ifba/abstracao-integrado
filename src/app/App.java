package app;

import model.Cachorro;
import model.Gato;

public class App {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Garfield");
        gato.emitirSom();
        gato.colocarDomir();
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.emitirSom();
        cachorro.colocarDomir();
        

    }
}
