package Livraria.Unicentro;

public class LivroClasse {
    private String titulo, autor;
    private int anoPublicacao;

    public LivroClasse(String T, String A, int ano){
        this.titulo = T;
        this.autor = A;
        this.anoPublicacao = ano;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

}