package ATT02;

import java.util.*;

public class ATT01APP {
    public static void main(String[] args){
        String[] cores = {"vermelho", "branco", "azul", "verde", "cinza",
                "laranja", "laranja", "cinza","vermelho"};
        List <String> list = new ArrayList<>(Arrays.asList(cores));

        HashSet <String> hashset = new HashSet<String>();
        hashset.addAll(list);

        TreeSet<String> tree = new TreeSet<String>();
        tree.addAll(list);

        printCollection(list);

        printCollection(hashset);

        printCollection(tree);
    }
    public static void printCollection(Collection<String> L){
        System.out.println("COnjunto: " + L);
    }
}
