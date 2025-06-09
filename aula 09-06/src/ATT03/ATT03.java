package ATT03;

import java.util.*;

public class ATT03 {
    public static void main(String[] args) {
        String[] cores = { "preto", "amarelo", "verde", "azul", "branco" };
        List<String> list1 = new LinkedList<>(Arrays.asList(cores));
        printList(list1);
        String[] cores2 = {"dourado", "prata", "marron", "cinza"};
        List<String> list2 = new LinkedList<>(Arrays.asList(cores2));
        printList(list2);
    }
    public static <T> void printList(Collection<T> L){
        for(T ele: L){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
