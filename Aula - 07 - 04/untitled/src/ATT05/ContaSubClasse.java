package ATT05;

public class ContaSubClasse extends ContaSuperClasse {
    public ContaSubClasse(Double D){
        super(D);
    }

    @Override
    public double getTaxa(double ValorDeSaque){
        return getSaldo() * 0.01;
    }
}
