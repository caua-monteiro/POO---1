package ATT03;

public class Motor {
    private String tipo;

    public Motor(String T){
        this.tipo = T;
    }

    @Override
    public String toString(){
        return (tipo);
    }
}
