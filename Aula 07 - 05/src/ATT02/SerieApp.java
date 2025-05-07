package ATT02;

import java.util.Scanner;

public class SerieApp {
    public static void main(String[] args) {
        Series[] series = new Series[2];
        series[0] = new MaisDois();
        series[1] = new MaisTres();
        executa(series);
    }

    public static void executa(Series[] series) {
        Scanner cin = new Scanner(System.in);
        for(Series i: series){
            System.out.println("numero de inicio: ");
            i.setStart(cin.nextInt());

            System.out.println("cinco proximos numeros:");
            for(int j = 0; j < 5; j++){
                System.out.print(i.getNext() + " ");
            }
            System.out.println();
            i.reset();
            System.out.println("proximo Numero apos reset: " + i.getNext());
        }
    }
}
