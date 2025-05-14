package ATT2;

public class Robo implements Falante{
    public void falar(){
        System.out.println("Ola, eu sou um ROBO");
    }
    public String seuIdioma(){
        return "Portugues";
    }
    public void reboot(){
        System.out.println("Estou resetando, por favor aguarde");
    }
}
