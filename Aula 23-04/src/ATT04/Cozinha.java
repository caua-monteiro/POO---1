package ATT04;

public class Cozinha {
    Liquidificador liquidificador;
    Microondas microondas;
    Geladeira geladeira;

    public Cozinha(Liquidificador l, Microondas m, Geladeira g){
        this.liquidificador = l;
        this.microondas = m;
        this.geladeira = g;
    }

    public void ligar(){
        liquidificador.ligar();
        microondas.ligar();
        geladeira.ligar();
    }

    public void desligar(){
        liquidificador.desligar();
        microondas.desligar();
        geladeira.desligar();
    }
}
