import java.util.*;

public class LivroMain {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        ObjLivro Livro1 = new ObjLivro();

        Livro1.setTitulo(cin.nextLine());
        Livro1.setAutor(cin.nextLine());

        Livro1.ExibeDados();
    }
}