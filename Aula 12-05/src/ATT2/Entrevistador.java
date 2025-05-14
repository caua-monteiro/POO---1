package ATT2;

public class Entrevistador {
    private String idioma;
    public void entrevista(Falante f) {
        if (f instanceof Estudante) {
            System.out.println("Ola, Estudante!");
        } else if (f instanceof Robo) {
            System.out.println("Ola, Robo");
        }
        idioma = f.seuIdioma();
        f.falar();
        if(f instanceof Estudante){
            ((Estudante) f).identificairse();
        } else if (f instanceof Robo) {
            ((Robo) f).reboot();
        }
        System.out.println("Vou entrevistar voce em " + idioma);
    }
}
