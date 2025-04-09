package ATT01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner cin = new Scanner(System.in);
        Produto[] produtos = new Produto[2];

        produtos[0] = new Produto("Bola", 29.99);
        if (rand.nextInt()%2 == 1) {
            System.out.print("Vc ganhou uma promocao!!, qual sera o valor? ");
            produtos[0].setPromocao(cin.nextDouble());
        }
        produtos[1] = new Livro("Redes Neurais", 149.99, "Simon Haykin", 786);
        if (rand.nextInt()%2 == 1) {
            System.out.print("Vc ganhou uma promocao!!, qual sera o valor? ");
            produtos[1].setPromocao(cin.nextDouble());
        }
        for(Produto p: produtos){
            if(p.getPromocao() == 0)
                p.exibeProduto();
            else
                p.exibeProduto(p.getPromocao());

            System.out.println();
        }
    }
}
