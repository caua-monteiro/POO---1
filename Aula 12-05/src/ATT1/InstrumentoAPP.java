package ATT1;

public class InstrumentoAPP {
    public static void main(String[] args){
        Instrumento[] instrumentos = new Instrumento[5];
        instrumentos[0] = new Sopro();
        instrumentos[1] = new SoproMadeira();
        instrumentos[2] = new SoproMetal();
        instrumentos[3] = new Corda();
        instrumentos[4] = new Percussao();

        for(Instrumento i: instrumentos){
            i.nome();
            i.afinar();
            i.tocar();
            System.out.println();
        }

    }
}
