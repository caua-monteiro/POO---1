package Livraria.Unicentro;

public class AppLivro {
    public static void main(String[] args){
        LivroClasse[] livros = new LivroClasse[3];

       livros[0] = new LivroClasse("L1", "A1", 2000);
       livros[1] = new LivroClasse("L2", "A2", 2001);
       livros[2] = new LivroClasse("L3", "A3", 2006);

        for(LivroClasse L: livros){
            System.out.println(L.getTitulo());
            System.out.println(L.getAutor());
            System.out.println(L.getAnoPublicacao());
            System.out.println();
        }
    }
}
