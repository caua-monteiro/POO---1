package ATT05;

import java.util.Scanner;

public class ContaSuperClasse {
    private double Saldo;
    Scanner cin = new Scanner(System.in);
    public ContaSuperClasse(){
        Saldo = 0;
    }
    public ContaSuperClasse(double S){
        if(S >= 0)
            this.Saldo = S;
        else{
            System.out.println("Saldo invalido. saldo da conta definido como 0");
            this.Saldo = 0;
        }
    }
    public double getSaldo(){
        return Saldo;
    }
    public void setSaldo(double x){
        this.Saldo = x;
    }
    public double getTaxa(double ValorDeSaque){
        if(ValorDeSaque >= 0)
            return ValorDeSaque * 0.02;
        else{
            System.out.println(ValorDeSaque + "nao e um valor valido, tente novamente");
            return getTaxa(cin.nextDouble());
        }
    }
    public void Saque(double ValorDeSaque){
        setSaldo(getSaldo() - ValorDeSaque);
        setSaldo(getSaldo() - getTaxa(ValorDeSaque));
        System.out.println("Taxa: " + getTaxa(ValorDeSaque));
    }
    public void Exibicao(){
        System.out.println("Saldo Da Conta:" + Saldo);
    }
}