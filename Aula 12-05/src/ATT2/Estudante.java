package ATT2;

public class Estudante extends Pessoa implements Falante{
    public Estudante(String n, int i){
        super(n, i);
    }

    public void falar(){
        System.out.println("Sou um estudante, Bom Dia!");
    }
    public String seuIdioma(){
        return "Portugues";
    }
    public void identificairse(){
        System.out.println("Eu sou " + getNome() + " e tenho " + getIdade() + " anos");
    }
}
