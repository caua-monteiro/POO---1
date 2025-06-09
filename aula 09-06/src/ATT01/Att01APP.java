package ATT01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Att01APP {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Nome1");
        nomes.add("Nome2");
        nomes.add("Nome3");
        nomes.add("Nome4");
        nomes.add("Nome5");

        ListIterator<String> iter = nomes.listIterator(nomes.size());
        while (iter.hasPrevious()){
            System.out.println(iter.previous() + " ");
        }


    }
}
