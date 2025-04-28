public class Palestra {
    private Luz luz;

    public Palestra(Luz l){
        this.luz = l;
    }

    public String acessa(){
        switch (luz){
            case AMBAR:
                return "Palestra sendo liberada";
            case VERMELHO:
                return "Palestra indisponivel";
            case VERDE:
                return  "Palestra disponivel";
            default:
                return "INVALIDO";
        }
    }
}
