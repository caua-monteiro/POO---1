package ATT01;

public class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro(String N, Double P, String A, int pg){
        super(N, P);
        this.autor = A;
        this.paginas = pg;
    }

    public boolean ehLongo(){
        return paginas > 300;
    }

    @Override
    public void exibeProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Autor:" + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Preco: " + getPreco());
        System.out.println("Caro? " + ehCaro());
        System.out.println("Longo?" + ehLongo());
    }

    @Override
    public void exibeProduto(double promocao){
        System.out.println("Nome: " + getNome());
        System.out.println("Autor:" + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Preco: " + (getPreco() - getPromocao()));
        System.out.println("Caro? " + ehCaro(promocao));
        System.out.println("Longo?" + ehLongo());
    }
}
