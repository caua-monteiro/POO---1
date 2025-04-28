package ATT01;

public class Dispositivo {
    private int codigo;
    private String nome;

    Dispositivo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void usar(String user) {
        System.out.println(user + " Esta usando o dispositivo " + nome);
    }
}
