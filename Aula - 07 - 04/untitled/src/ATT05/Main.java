package ATT05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ContaSuperClasse[] Contas = new ContaSuperClasse[3];

        Contas[0] = new ContaSubClasse(cin.nextDouble());
        Contas[1] = new ContaSuperClasse(cin.nextDouble());
        Contas[2] = new ContaSuperClasse(cin.nextDouble());

        double ValorSaque = cin.nextDouble();

        for(ContaSuperClasse C: Contas){
            C.Saque(ValorSaque);
        }

        for(ContaSuperClasse C: Contas){
            C.Exibicao();
            System.out.println();
        }
    }
}
