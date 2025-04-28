package ATT03;

import java.util.Scanner;

public class UsaFigura {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        Figura[] figuras = new Figura[3];

        figuras[0] = new Figura();
        figuras[1] = new Quadrado();
        figuras[2] = new Circulo();

        System.out.print("Insira a area da figura: ");
        System.out.println(figuras[0].area(cin.nextDouble()));
        System.out.println();

        System.out.print("Insira o lado do quadrado: ");
        System.out.println(figuras[1].area(cin.nextDouble()));
        System.out.println();

        System.out.print("Insira o raio do circulo: ");
        System.out.println(figuras[2].area(cin.nextDouble()));
        System.out.println();

    }
}
