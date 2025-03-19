public class ObjLivro {
    String titulo, autor;
    public ObjLivro(){
        titulo = "";
        autor = "";
    }

    public void setTitulo(String Titulo1){
        titulo = Titulo1;
    }
    public void setAutor(String Autor1){
        autor = Autor1;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public void ExibeDados(){
        System.out.println("Nome do Livro: " + getTitulo());
        System.out.println("Autor(a): " + getAutor());
    }
}