public class ObjLivro {
    private String titulo, autor;
    private static int contador = 0;

    public ObjLivro(){
        titulo = "Desconhecido";
        autor = "Anonimo";
        contador ++;
    }
    public ObjLivro(String T, String A){
        this.titulo = T;
        this.autor = A;
        contador ++;
    }

    public static int getContador(){
        return contador;
    }

    public void exibeDados(){
        System.out.println("livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("contador: " + getContador());
    }

}