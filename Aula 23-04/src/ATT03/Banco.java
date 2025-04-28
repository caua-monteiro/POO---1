package ATT03;

public class Banco {
    private String Fabricante;

    public Banco(String F){
        this.Fabricante = F;
    }

    @Override
    public String toString(){
        return (Fabricante);
    }
}
