package ATT02;

public class TestaAnimal {
    public static void main(String[] args){
        Animal[] animais = new Animal[4];

        animais[0] = new Animal();
        animais[1] = new Cachorro();
        animais[2] = new Gato();
        animais[3] = new Preguica();

        for(Animal a: animais){
            a.emitirSom();
        }
    }
}
