import java.util.*;

public class PastelariaPistola {
    public static void main(String[] args){
        ArrayList<Pastel> pastels = new ArrayList<>();

        pastels.add(new Pastel("Carne", 8.00));
        pastels.add(new Pastel("queijo", 8.00));
        pastels.add(new Pastel("pizza", 8.00));
        pastels.add(new Pastel("frango", 8.00));
        pastels.add(new Pastel("Carne e queijo", 10.00));
        pastels.add(new Pastel("carne seca com catupiry", 10.00));

        System.out.println(pastels);
    }
}
