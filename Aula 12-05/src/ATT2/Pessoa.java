package ATT2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
