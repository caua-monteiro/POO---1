package ATT04;

public class Liquidificador {
    private boolean ligado;

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public boolean isLigado(){
        return ligado;
    }

    public void observa(){
        System.out.println("Liquidificador esta ligado? " + ligado);
    }

}
