package ATT04;

import java.util.*;

public class att04APP {
    public static void main(String[] args) {
        char[] chrs = { 'V', 'J', 'L', 'E', 'E'};

        TreeSet<Character> ts = new TreeSet<Character>();
        HashSet<Character> hs = new HashSet<Character>();
        System.out.print("Conteudo de chrs:      ");
        for(char ch : chrs)
            System.out.print(ch + "  ");
        System.out.println();

        for(char ch : chrs)
            hs.add(ch);
        System.out.println("Conteudo do conjunto hash: " + hs);

        for(char ch : chrs)
            ts.add(ch);
        System.out.println("Conteudo do conjunto de arvore: " + ts);
    }
}
